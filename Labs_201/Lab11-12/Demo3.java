import java.util.*;

public class Demo3 {

    public static void main (String [] args) {
        int [] data = new int[100];
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the values into the array, counting 
        //  and summing up the values as you read them in
        
        // You will need to add some code here
        
        System.out.print("Enter an integer: ");     // fencepost
        while (count < 100 && sc.hasNextInt()) {    // why count < 100 ??
            data[count] = sc.nextInt();
            // You will need to add some code here
            System.out.print("Enter an integer: "); // fencepost
	}

        // Step 2: Calculate the average. Print sum, count, and average.

        
        

        // Step 3: Using the average, go through the array
        // again to calculate the standard deviation.
        // Do NOT ask the TA or instructor for the Java methods
        // to implement the standard deviation formula. Look it
        // up in the Java api docs that you should have bookmarked
        // by now (if not, start at java.sun.com/api and follow
        // links for Java 6 SE).


    } // end main
    
} // end class
