import java.util.*;
import java.io.*;

public class WordLengths {

    public static void main (String [] args) throws FileNotFoundException {
	Scanner sc = new Scanner(new File("t1.txt"));
	wordLengths(sc);
	System.out.println();

	sc = new Scanner(new File("t2.txt"));
	wordLengths(sc);
	System.out.println();

	sc = new Scanner(new File("t3.txt"));
	wordLengths(sc);
	System.out.println();
    }


    public static void wordLengths(Scanner sc) {
       int [] count = new int [81];
       while (sc.hasNext()) {
            String token = sc.next();
            count[token.length()]++;
       }

       for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.print(i + ": " + count[i] + "\t");
                for (int j = 1; j <= count[i]; j++) {
                     System.out.print("*");
                }
                System.out.println();
            }
       }
    }

}
