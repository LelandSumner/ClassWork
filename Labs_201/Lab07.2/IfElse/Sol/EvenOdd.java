import java.util.*;

public class EvenOdd {

    public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: " );
	int number = sc.nextInt();

	// put solution to problem here
        System.out.print(number + " is ");
	if (number % 2 == 0)
	    System.out.println("even");
	else
	    System.out.println("odd");


    }
}
