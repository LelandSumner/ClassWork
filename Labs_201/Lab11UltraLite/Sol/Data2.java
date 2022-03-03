import java.util.*;
import java.io.*;

public class Data2 {
    public static void main (String [] args)  throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("data2.txt"));
        Random rand = new Random();
	for (int i = 0; i < 1000; i++) {
	    int n = rand.nextInt(11) + 20;
	    ps.println(n);
 	}
    }
}

