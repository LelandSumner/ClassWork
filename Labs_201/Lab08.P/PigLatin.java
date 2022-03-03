import java.util.*;

public class PigLatin {

    public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter a word (all lower case): ");
        String word = input.next();
        String pigLatin = toPigLatin(word);
        System.out.println(word + " --> " + pigLatin);
    }

    // write your method here

}
