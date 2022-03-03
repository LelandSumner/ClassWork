import java.util.*;

public class Fence {

    public static void main (String [] args) {
        System.out.print("Enter a postive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Factors of " + n + " are: ");
        printFactors(n);
    }    

    public static void printFactors(int n) {
        System.out.print("1");
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }
        }
        System.out.println();
    }
}
