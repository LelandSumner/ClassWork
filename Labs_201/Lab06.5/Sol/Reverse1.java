import java.util.*;

public class Reverse1 {
    public static void main (String [] args) {

        System.out.print("Enter a word or phrase: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
       
        System.out.print("In reverse, that is: ");
        printReverse(text);
    }

    // put printReverse() here
    public static void printReverse(String s) {
        int len = s.length();
        for (int i = len-1; i >=0; i--) {
	    System.out.print(s.charAt(i));
	}
        System.out.println();
    }


}
