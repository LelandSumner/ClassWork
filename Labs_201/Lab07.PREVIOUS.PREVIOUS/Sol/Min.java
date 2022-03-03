import java.util.*;

public class Min {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values will you enter? ");
        int numbers = sc.nextInt();
        int smallest = min(sc, numbers);

        System.out.println("\nMinimum value is " +  smallest + "\n");


    }    

    public static int min(Scanner sc, int n) {
        System.out.print("Enter an integer: ");
        int min = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print("Enter an integer: ");
            int value = sc.nextInt();
            if (value < min) {
                min = value;
	    }       
	}
        return min;
    }

} 
