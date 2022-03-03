import java.io.*;
import java.util.*;

public class Numbers {

    /*
        This program prompts the user for a filename. It then reads the
        file, ignoring any tokens that are not doubles. Once the file
        has been read the program prints the maximum, minimum, sum, and 
        average of all the numbers found in the file.
    */

    public static void main (String [] args) 
            throws FileNotFoundException 
    {
        Scanner input = // what should you do here?? Hint: look at the 
                        // method openFile() below

        double max = input.nextDouble();
        // finish program here

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/count));

    }


    /*
        Repeatedly prompt the user until a valid filename is entered.
        Set up a Scanner to read the file, and return the Scanner.
    */
    public static Scanner openFile() 
            throws FileNotFoundException 
    {
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

} // end class
