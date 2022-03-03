import java.util.*;

public class SC4_24 {

    public static void main(String[] args) {
	// output should all be 'true'
	System.out.println(secondHalfLetters("ruminates") == 5);
	System.out.println(secondHalfLetters("mississippi") == 6);
	System.out.println(secondHalfLetters("Q") == 1);
	System.out.println(secondHalfLetters("XYLOpHoneS") == 7);
	System.out.println(secondHalfLetters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ") == 26);
	System.out.println(secondHalfLetters("KeKeKe") == 0);
	System.out.println(secondHalfLetters("") == 0);


    }

    // Write secondHalfLetters below here...
    public static int secondHalfLetters(String word) {
        word = word.toLowerCase();
	int count = 0;
	for (int i = 0; i < word.length(); i++) {
	    char c = word.charAt(i);
	    if ('n' <= c && c <= 'z') {
		count++;
	    }
	}
	return count;
    }

}