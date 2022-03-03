import java.util.*;

public class FractionSum {

    public static void main (String [] args) {
        System.out.print("Enter a postive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = fractionSum(n);
        System.out.println("The sum of 1/i for i=1 to i=" + n +
                           " is " + sum);
    }    

    // write fractionSum() below for Checkpoint 1
    public static double fractionSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
	}
        return sum;
    }

}
