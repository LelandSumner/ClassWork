import java.util.*;

public class MathDemo2 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first of three integers: " );
        int a = sc.nextInt();
        System.out.print("Enter the second integer: " );
        int b = sc.nextInt();
        System.out.print("Enter the third: " );
        int c = sc.nextInt();
        int largest = largestAbsVal(a, b, c);
        System.out.println ("Of " + a + ", " + b + ", and " + c + 
                             ", the largest absolute value is " + largest);
    }


    // put largestAbsVal() here
    public static int largestAbsVal(int n1, int n2, int n3) {
        return Math.max(Math.max(Math.abs(n1), Math.abs(n2)), Math.abs(n3));
    }
}
