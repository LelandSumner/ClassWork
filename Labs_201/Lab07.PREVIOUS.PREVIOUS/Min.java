import java.util.*;

public class Min {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values will you enter? ");
        int numbers = sc.nextInt();
        int smallest = min(sc, numbers);

        System.out.println("\nMinimum value is " +  smallest + "\n");


    }    

    // put min() here
} 
