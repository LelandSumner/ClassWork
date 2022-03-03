import java.util.*;

public class Xxxxx {

    public static void main (String [] args) {

        Random rand = new Random();
        int numLines = rand.nextInt(9) + 2;
        for (int i = 1; i <= numLines; i++) {
	    int numXs = rand.nextInt(15) + 4;
            for (int j = 1; j <= numXs; j++) {
                System.out.print("x");
	    }
            System.out.println();
	}


    }

}
