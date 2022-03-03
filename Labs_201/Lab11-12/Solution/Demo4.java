import java.util.*;
import java.io.*;

public class Demo4 {

    public static void main (String [] args) throws FileNotFoundException{
	Scanner sc = new Scanner(new File("data.txt"));
        printCounts(sc);
    }

    // write printCounts() here
    public static void printCounts (Scanner sc) {
        int count = 0;
        int [] counts = new int[10];
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            count++;
            counts[n]++;
	}

        System.out.println("Frequency Table");
        for (int i = 0; i < 10; i++) {
	    System.out.println(i + ": " + counts[i]);
	}         
        System.out.println("There were " + count + " values in the file.");
    }
}
