import java.util.*;
import java.io.*;

public class Demo5{

    public static void main (String [] args) throws FileNotFoundException{
	Scanner sc = new Scanner(new File("data2.txt"));
        int [] numbers = readArray(sc);
	int [] frequency   = getCounts(numbers, 20, 30);
	for (int i = 0; i < frequency.length; i++) {
	    System.out.println((i + 20) + ": " + frequency[i]);
	}
    }

    public static int [] readArray(Scanner sc) {
        int [] data = new int [1000];
        for (int i = 0; i < data.length; i++) {
            data [i] = sc.nextInt();
	}
	return data;
    }

    public static int[] getCounts(int [] a, int low, int high) {
        int [] counts = new int[high-low+1];
        for (int i =0; i < a.length; i++)
	    counts[a[i] - low]++;
	return counts;
    }
}
