import java.util.*;

public class ShowTwos {

    public static void main (String [] args)  {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        showTwos(number);
    }

    public static void showTwos(int n) {
        System.out.print( n + " = ");
        while (n % 2 == 0  && n > 2) {
	    System.out.print(2 + " * ");
            n = n / 2;
	}
        System.out.println(n);
    }

}
