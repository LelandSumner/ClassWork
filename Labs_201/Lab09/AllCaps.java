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

    // write isUpperCase() here
}
