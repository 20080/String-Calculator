package main;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

//the one and only required function by the calculator
    public static int add(String data) {
        count++;
        if (data.isEmpty()) return 0;
        else {
            return returnNumbers(data);
        }
    }


    private static int returnNumbers(String s) {
        int ans = 0;
        //custom separator check
        StringBuilder regex = new StringBuilder(";\n,");
        //This if statement checks if the String going to have multiple separators
        if (s.startsWith("//[")) {
            int i=0;
            //using set so only one copy of each type of regex gets recorded
            Set<Character> set = new HashSet<>();
            while(s.charAt(i)!='\n') {
                if (s.charAt(i) == '[' || s.charAt(i) == ']'){
                    i++;
                    continue;
                }

                set.add(s.charAt(i));
                i++;
            }
            for(Character x : set){
                regex.append(x);
            }

            //reIndexing the string here so it starts
            //form the position where the actual calculation needed to be done
            s = s.substring(i+1);
            System.out.println(regex);

        }
        //this if statement is for when the
        // string has only one type of custom separator
        else if (s.startsWith("//")) {
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(s);
            matcher.matches();
//            regex = Pattern.quote(matcher.group(1));
            regex = new StringBuilder(matcher.group(1));
            s = matcher.group(2);

        }

        //at last if the above conditions skips here only one option left i.e.
        // the string has the default separator i.e. , or ; as given in the problem
        //or it also processes if the string was one of the above type
        if (s.length() > 1) {
            String[] st = s.split("[" + regex + "]");
            StringBuilder nv = new StringBuilder();
            for (String ss : st) {
                int temp;
                try{
                    temp = Integer.parseInt(ss);
                }
                catch (NumberFormatException e){
                    continue;
                }
                if (temp < 0) {
                    nv.append(ss).append(" ");
                }
                if (temp > 1000)
                    continue;
                ans += temp;
            }
            if (nv.length() > 0) {
                throw new RuntimeException("Negatives not allowed: " + nv);
            }
        }
        //if its just a single digit
        else if (s.length() == 1)
            ans = Integer.parseInt(s);
        return ans;
    }


    private static int count;
//program to count the number of Add function calls
    public static int GetCalledCount() {
        return count;
    }
}
