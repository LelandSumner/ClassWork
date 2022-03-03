import java.util.*;
import java.io.*;

public class G {

    public static void main (String [] args) throws FileNotFoundException{
	PrintStream ps = new PrintStream(new File("data.txt"));
        Random rand = new Random();
        int length = rand.nextInt(100) + 9000;
        for (int i = 0; i <= length; i++) {
            if (rand.nextDouble() < .7)
               ps.print(rand.nextInt(5) + " ");
            else
               ps.print(rand.nextInt(5) + 5 + " ");
	}
    }
}
