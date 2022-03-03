import java.util.*;

public class Min {

    public static void main (String [] args) {
        System.out.print("How many values will you enter? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = min(sc, n);
        System.out.println("\nMinimum value is " +  min);
    }    

    // write min() here for Checkpoint 1
    public static int min(Scanner sc, int n) {
        System.out.print("Enter an integer: ");
	int min = sc.nextInt();
        for (int i = 1; i <= n-1; i++) {
           System.out.print("Enter an integer: ");
           int next = sc.nextInt();
           if (next < min) {
	       min = next;
	   }
	}
        return min;
    }

} 
