import java.util.*;

public class Fence {

    public static void main (String [] args) {
        System.out.print("Enter a postive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Factors of " + n + " are: ");
        printFactors(n);
    }    

    // write printFactors() below here
    public static void printFactors(int n) {

        for (int i = 1; i < n; i++) {
	    if (n % i == 0)
		System.out.print(i + ", ");
	}
	System.out.println(n);
    }


}
