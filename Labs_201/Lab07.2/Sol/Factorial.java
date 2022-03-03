import java.util.*;

public class Factorial {

    public static void main (String [] args) {
	System.out.print("Enter a non-negative integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        System.out.println(n + "! = " + factorial(n));
    }

    // put factorial() here
    public static int factorial(int n) {
	int fact = 1;
        for (int i = 1; i <= n; i++) {
	    fact = fact * i;
	}
        return fact;
    }
}
