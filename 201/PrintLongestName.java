/*
Leland Sumner
CIS 201
Section 001
Assignment 8
*/

import java.util.*;

public class PrintLongestName {
    public static void main ( String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console,5);
    
    }
    
    public static void longestName (Scanner console, int n) {
         
         System.out.print("name 1:");
         String a = console.next();
         int tie = 0;
        for(int i = 2; i <= n; i++) {
            
            System.out.print("name " + i + ":");
            String b = console.next();
            if (a.length() < b.length()) {
                a = b;
                tie = 0;     // resets check if new longest
            } else if (a.length() == b.length()) {     // there is a tie
                tie ++;
            }
            
        }
        System.out.println(capitlaize(a) + "'s name is the longest");
        if (tie > 0) {
            System.out.println ("(There was a tie!)");
        }
    }
    public static String capitlaize (String longest) {     // capitalizes longest string
        String c = longest.substring(0,1);
        String l = longest.substring(1);
        return c.toUpperCase() + l.toLowerCase();
    }
}
