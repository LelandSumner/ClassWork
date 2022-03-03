import java.util.*;

public class ModDiv {

    public static void main (String [] args) {

        // get a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 6-digit number: ");
        int n = sc.nextInt();
       
        // repeat the number at the console
        System.out.println("The number entered was: " + n);
 
        // isolate the last three digits of the number
        // replace 0 with the correct expression
        int lastThree = n % 1000;

        // isolate the 3rd digit of the number (from the left)
        // replace 0 with the correct expression
        int digit3 = n / 1000 % 10;

        // get the first 2 digits of the number
        // replace 0 with the correct expression
        int firstTwo = n / 10000;

        // print the results
        System.out.println("The last three digits are: " + lastThree);
        System.out.println("The third  digit is: " + digit3);
        System.out.println("The first two digits are: " + firstTwo);
    }

}
