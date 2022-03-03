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

    // write wordLengths() here


}
