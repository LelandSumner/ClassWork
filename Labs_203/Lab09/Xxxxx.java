import java.util.*;

public class Xxxxx {

    public static void main (String [] args) {

        Random rand = new Random();
        int numLines = rand.nextInt(9) + 2;
        for (int i = 1; i <= numLines; i++) {
	    int numXs = rand.nextInt(15) + 5;
	    for( int d = 1; d <= numXs; d++) {
	       System.out.print("X");
	       }
	       System.out.println();
           
	}

    }

}
