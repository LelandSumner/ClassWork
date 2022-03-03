import java.util.*;

public class Demo2 {

    public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
        // get the number of values
	System.out.print("How many values will you enter? ");
	int size = sc.nextInt();
        double [] a = readArray(size);
	// print out the array
	printArray(a);
        // print out the array backwards
	reversePrintArray(a);
    }

    // constructs an array of the size passed in and prompts the user
    // to fill it will values
    public static double []  readArray(int size) {
	Scanner sc = new Scanner(System.in);
	double [] numbers = new double[size];
	for (int i = 0; i < size; i++) {
	    System.out.print("Enter a value: " );
	    numbers[i] = sc.nextDouble();
	}
	return numbers;
    }

    // finish printArray() here
    public static void printArray(double [] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

    }
    
    public static void reversePrintArray(double [] values) {
        for (int i = values.length - 1; i >= 0 ; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

}
