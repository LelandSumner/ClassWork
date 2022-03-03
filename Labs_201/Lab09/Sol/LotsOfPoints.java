
import java.util.*;


public class LotsOfPoints {

    public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("How many data points do you want to use? ");
	int n = sc.nextInt();
        System.out.println("Calculating the area of the unit circle.");
	System.out.println("The area is approximately " + estimateArea(n));
    }

    public static double estimateArea (int n) {
        Random rand = new Random();

        int count = 0;
	for (int i = 1; i <= n; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
	    if (Math.sqrt(x*x + y*y) <= 1.0)
		count++;
	}
        System.out.println(count);
        return 4.0*count/n;
    }

}
