package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the numbers in following format to add them:");
        System.out.println("3,5,6---- separated by comma or ;");
        System.out.println("Custom separators can be used by using /type2 command by the following format: ");
        System.out.println("insert type2 then write in following format");
        System.out.println("//[**][&]\n16**2&3");

            String s = sc.nextLine();
            if(s.equals("type2")){
                String one = sc.nextLine();
                String two = sc.nextLine();
                s = one+"\n"+two;
            }
            System.out.println(Calculator.add(s));
        System.exit(0);
    }
}
