import java.util.*;
import java.io.*;

public class Data {
    public static void main (String [] args)  throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("data.txt"));
	Random rand = new Random();
	int size = 1000;
	ps.println(size);
	for (int i = 0; i < 1000; i++) {
	   double n = rand.nextDouble() * (rand.nextInt(10) + 1) * 10;
	   if (rand.nextInt(3) == 0)
	       n *= -1;
	   ps.println(n);
	}
    }
}
