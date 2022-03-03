import java.util.*;

public class AllCaps {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        if (isUpperCase(word)) {
            System.out.println("That word is all uppercase letters");
	} else {
            System.out.println("That word is NOT all uppercase letters");
	}
    }

    public static boolean isUpperCase(String x) {
        
        for( int i = 0; i<= x.length()-1; i++) {
            if (!(x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')) {
                return false;
            }
        }
        return true;
            
    }
}
