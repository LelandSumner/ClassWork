import java.util.*;
import java.awt.*;

public class LotsOfPoints {

    final static int NUM_POINTS = 1000000;
 
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick your point.");
        System.out.print("Pick x (0<= x < 100, integer value): ");
        int x = sc.nextInt();
        System.out.print("Pick y (0<= y < 100, integer value): ");
        int y = sc.nextInt();
        Point p = new Point (x, y);
        System.out.println("Your point is " + p);

        System.out.println("\nLet's see how many of " + NUM_POINTS +
                           " random points match yours ...");
        System.out.println("There were " + numMatches(p) +
                           " random points that matched yours.");
    }

    public static int numMatches (Point p) {

        Random rand = new Random();
        int count = 0;

	for (int i = 1; i <= NUM_POINTS; i++) {
            int x = rand.nextInt(100);
            int y =  rand.nextInt(100);
            Point q = new Point(x, y);
            if (p.equals(q)) {
		count++;
	    }
	}
       
        return count;
    }

}
