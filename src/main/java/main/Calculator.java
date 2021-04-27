package main;

public class Calculator {
    public static int add(String data) {
        if (data.isEmpty()) return 0;
        else{
            return returnNumbers(data);
        }
    }

    private static int returnNumbers(String s) {
        int ans = 0;
        //if separated by a comma or a new line
        if (s.length() > 1 && s.contains(",")) {
            String[] st = s.split("[,\n]");
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
