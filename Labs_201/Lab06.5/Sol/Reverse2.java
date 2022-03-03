import java.util.*;

public class Reverse2 {
    public static void main (String [] args) {

        System.out.print("Enter a word or phrase: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
       
        System.out.println("In reverse, that is: " + getReverse(text));
    }

    // put getReverse() here
    public static String getReverse(String s) {
        int len = s.length();
        String result = "";
        for (int i = len-1; i >=0; i--) {
	    result += s.charAt(i);
	}
        return result;
    }


}
