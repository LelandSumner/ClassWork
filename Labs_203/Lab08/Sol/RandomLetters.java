import java.util.*;

public class RandomLetters {

    public static void main (String [] args)  {
        for (int i = 1; i <= 10; i++) {
	    //            System.out.println(randomLetter());
            System.out.println(randomLetterStream());
	}
    }

    public static char randomLetter() {
        Random rand = new Random();
        int coinToss = rand.nextInt(2);
        if (coinToss == 0) {
           return (char)('a' + rand.nextInt(26));
	} else {
           return (char)('A' + rand.nextInt(26));
	}
    }

    public static String randomLetterStream() {
        Random rand = new Random();
        int n =  rand.nextInt(9) + 4;
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += randomLetter();
	}
        return result;
    }

}
