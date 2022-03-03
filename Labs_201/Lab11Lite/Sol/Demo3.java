import java.util.*;
import java.io.*;

public class Demo3 {

    public static void main (String [] args) throws FileNotFoundException{
	Scanner sc = new Scanner(new File("data.txt"));
        // get the number of values
	int size = sc.nextInt();
        double [] a = readArray(sc, size);
        double average = average(a);
	System.out.println("Average = " + average);
	System.out.println("The largest value in the data set is: " +
			   max(a));
    }

    // constructs an array of the size passed in and prompts the user
    // to fill it will values
    public static double []  readArray(Scanner sc, int size) {
	double [] numbers = new double[size];
	for (int i = 0; i < size; i++) {
	    numbers[i] = sc.nextDouble();
	}
	return numbers;
    }

    
    // write average() here
    public static double average (double [] numbers) {
        double sum = 0;
	for (int i = 0; i < numbers.length; i++) {
	    sum += numbers[i];
	}
	return sum / numbers.length;
    }

    // write max() here
    public static double max(double [] numbers) {
        double max = numbers[0];
	for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
		max = numbers [i];
	    }
	}
	return max;
    }
}
