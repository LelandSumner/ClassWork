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

    public static int[] getCounts(int[] num ,int min,int max) {
        int[] tally = new int[max - min + 1];
        for(int i = 0; i < num.length; i++) {
            tally[ num[i] - min ]++;
        }
        return tally;
    }

}
