import java.io.*;
import java.util.*;

public class StripHTML {

    /*
        This program removes all HTML tags from a file, preserving 
        the rest of the text, including line breaks.
        
        PRE: the html tags have whitespace between them and any 
                adjacent token.
    */
    public static void main (String [] args) 
            throws FileNotFoundException 
    {
        Scanner input = openFile();
        // finish the program here

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
