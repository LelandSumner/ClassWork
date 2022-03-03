import java.util.*;

public class PigLatin {

    public static void main (String [] args) throws Exception {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter a word (all lower case): ");
        String word = input.next();
        String pigLatin = toPigLatin(word);
        System.out.println(word + " --> " + pigLatin);
    }

    public static String toPigLatin(String w) throws Exception {
        if (w.length() == 0)
	    throw new Exception("String is empty");

        char ch = w.charAt(0);
        if (ch == 'a' || ch == 'e' || 
            ch == 'i' || ch == 'o' ||
            ch == 'u')
	    return w.substring(1, w.length()) + "way";

        return w.substring(1, w.length())+ w.charAt(0) + "ay" ;
            
   }
}
