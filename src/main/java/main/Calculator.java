package main;

public class Calculator {
    public static int add(String data) {
        if(data.isEmpty()) return 0;
        else if(data.contains(",")){
            String[] st = data.split(",");
            int ans = 0;
            for(String s : st){
                ans += Integer.parseInt(s);
            }
            return ans;
        }
        else{
            return Integer.parseInt(data);
        }
    }
}
