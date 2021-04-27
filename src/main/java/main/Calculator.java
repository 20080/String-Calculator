package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static int add(String data) {
        if (data.isEmpty()) return 0;
        else{
            return returnNumbers(data);
        }
    }

    private static int returnNumbers(String s) {
        int ans = 0;
        //custom separator check
        String regex = ",\n";
        if(s.startsWith("//")){
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(s);
            matcher.matches();
            regex += matcher.group(1);
            s = matcher.group(2);
        }

        //if separated by a comma or a new line
        if (s.length() > 1) {
            String[] st = s.split("["+regex+"]");
            for (String ss : st) {
                ans += Integer.parseInt(ss);
            }
        }
        //if its just a single digit
        else if (s.length() == 1)
            ans = Integer.parseInt(s);
        return ans;
    }
}
