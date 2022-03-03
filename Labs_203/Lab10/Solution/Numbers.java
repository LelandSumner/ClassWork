import java.io.*;
import java.util.*;

public class Numbers {

    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = openFile();
        double max = input.nextDouble();
        double min = max;
        double sum = max;
        int count = 1;
        while (input.hasNext()) {
	    if (input.hasNextDouble()) {
               double next = input.nextDouble();
               if (next > max)
                  max = next;
               else if (next < min) {
	          min = next; 
                  sum += next;
                  count++;
	       }
	    } else {
		String junk = input.next();
	    }
	}
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/count));

    }

    public static Scanner openFile() throws FileNotFoundException {
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        File inFile = new File(fileName);
        while (!inFile.exists()) {
           System.out.println(fileName + " not found.");
           System.out.print("Enter file name: ");           
           fileName = input.nextLine();
           inFile = new File(fileName);
	}
        return new Scanner(inFile);
    }

}
