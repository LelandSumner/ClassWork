import java.io.*;
import java.util.Scanner;

public class PromptLoops {

    public static void main(String[] args)
    {
        testPart1();
        // testPart2();
        
    } // end main


    /*
    *******************************************************************
    Test the first exercise
    *******************************************************************
    */
    public static void testPart1() {
    
        Scanner infileScanner = promptForInputFile("Enter a file name to read: ");
        
        int count = 0;
        while (infileScanner.hasNextLine()) {
            String line = infileScanner.nextLine();
            System.out.printf("%5d : %s\n", count, line);
            ++count;
        }
    }


    /*
    *******************************************************************
    Prompts for the name of an input file, and returns a Scanner on
    that file.
    *******************************************************************
    */
    public static Scanner promptForInputFile(String prompt)
    {
        Scanner kbd = new Scanner(System.in);

        while (true) {
            System.out.print(prompt);
            String filename = kbd.nextLine();
            File file = new File(filename);
            try {
                Scanner fileScanner = new Scanner(file);
                break;          // success, get out of loop
            } catch (FileNotFoundException e) {
                System.out.println("*** ERROR: " + e.getMessage());
                System.out.println("*** Full path used: " +
                        file.getAbsolutePath());
            }
        }
        
        return fileScanner;

    } // end method

    /*
    *******************************************************************
    Test the second exercise
    *******************************************************************
    */
    public static void testPart2() {
        PrintStream outStream =
                promptForOutputFile("Enter a file name to write: ");

        outStream.println("This is new data, put into the file " +
                "using a PrintStream.");
        outStream.println("It worked!");
    }
    
    
    /*
    *******************************************************************
    Prompts for the name of an output file, and returns a PrintStream
    pointed to that file.

    POST: the returned PrintStream points to a file on disk that exists
    but is empty, and ready for writing.
    *******************************************************************
    */
    public static PrintStream promptForOutputFile(String prompt)
    {
        Scanner kbd = new Scanner(System.in);
        PrintStream outfileStream;

        while (true) {
            System.out.print(prompt);
            String filename = kbd.nextLine();
            File outfile = new File(filename);
            
            try {
                outfileStream = new PrintStream(outfile);
                break;      // success, get out of loop
            } catch (FileNotFoundException e) {
                System.out.println("*** ERROR: " + e.getMessage());
                System.out.println("*** Full path used: " +
                        outfile.getAbsolutePath());
            }
            
        }
        return outfileStream;
    
    } // end method
    
} // end class