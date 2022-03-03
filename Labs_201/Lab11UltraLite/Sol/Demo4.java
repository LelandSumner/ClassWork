import java.util.*;
import java.io.*;

public class Demo4 {

    public static void main (String [] args) throws FileNotFoundException{
	int [] numbers = {1, 3, 0, 4, 4, 3, 0, 1, 0, 4, 4, 1, 3, 4, 1};
        int [] cts = new int[5];
	for (int i = 0; i < numbers.length; i++) {
	    cts[ numbers[i] ]++;
	}
	System.out.println(Arrays.toString(cts));
    }

}
