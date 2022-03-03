/*
***********************************************************************
    Frequency Counter
    
    This program counts the frequency of characters found
    in a command-line specified file. The results are
    written to an output file which is also specified on
    the command line.
    
    Here, "frequency" of a character means how many times it
    occured in the file, in other words, its count.

***********************************************************************
*/

public class FrequencyCounter {

    /*
    *******************************************************************
    main --- Validate command-line arguments, open the files there 
    named, and process the input (keeping track of character frequencies
    in an array). When the input has been processed, write the array
    to the output file, and print some summary statistics to both the
    output file and the console.
    *******************************************************************  
    */
    public static void main(String[] args) {
    
        String usage = 
                "usage: FrequencyCounter <input file> <output file>";
                
                
        // Validate command-line args. If the user has not supplied exactly
        //  two command-line arguments, print the usage message and return.

        /* YOUR CODE HERE */
                
        
        // Attempt to open the files. First initialize an error message to
        //  the empty string. Then, use a try...catch block to set up a
        //  scanner on the input file (the file's name is in args[0]). If
        //  you wind up catching an exception, set errMsg to a message that
        //  says the input file does not exist or could not be opened. The
        //  actual filename (args[0]) should also be mentioned in this
        //  message. Do not exit the program in the catch block.
        // Write a similar try...catch block to set up a PrintStream based
        //  on the filename in args[1]. In the catch block, your error
        //  message should be informative, include the filename (args[1]),
        //  and be *appended* to whatever is already in the errMsg string 
        //  (that is, use the += operator). Do not exit the program in the 
        //  catch block.
        
        Scanner inScanner = null;           // reads input file
        PrintStream outStream = null;       // writes output file

        String errMsg = "";
//        try {
//            inScanner = /* YOUR CODE HERE */
//        } catch (/* YOUR CODE HERE */) {
//            /* YOUR CODE HERE */
//        }
//        
//        try {
//            outStream = /* YOUR CODE HERE */
//        } catch (/* YOUR CODE HERE */) {
//            /* YOUR CODE HERE */
//        }
        
        
        // Now check the errMsg string. If it's non-empty that means we
        //  executed one of the catch blocks, which means that we couldn't
        //  open either or both of the input/output files. So, print the
        //  errMsg string (to the console) and return from the program.
        
        /* YOUR CODE HERE */
        
        
        // Process the input file. There are 256 possible characters, and
        //  we want to count the frequencies of each. If we didn't have an
        //  array, we would have to keep 256 variables, perhaps named after
        //  their ASCII code, like this: 
        //      int frequencyOf000;
        //      int frequencyOf001;
        //      ...
        //      int frequencyOf032;         // number of spaces found
        //      int frequencyOf033;         // number of '!' characters found
        //      ...
        //      int frequencyOf255;         // an extended ASCII character
        //
        // Be we do have arrays, so we can simplify things tremendously:
        //
        //      int[] frequencyOf = new int[256]
        //
        // We also want variables to keep track of the total number of 
        //  characters read and lines read.
        //
        // The loop to read the file, counting frequencies (and total chars
        //  and lines) is fairly simple. Here's pseudocode for counting
        //  frequencies.
        //
        //      while (there's a line to be read)
        //          read it into a string
        //          for (i from 0 to line.length() - 1) {
        //              int c = ASCII code of the character at position i
        //              increment frequencyOf[c]
        //          } end for
        //      } end while
        //
        // Why "increment frequency[c]"? Well, suppose we read a character
        //  who's ASCII code is 102. Remember, if we didn't have an array
        //  we would have an int variable called frequencyOf102 that we
        //  would increment (to reflect that we'd seen a character with
        //  ASCII code 102). But we have the variable c holding that code 
        //  (102), and we have the array ... and in particular we have the 
        //  element frequencyOf[102]. So that is what we increment.
        //
        // The pseudocode above doesn't keep track of total chars and total
        //  lines read, but you should be able to figure out how to do that.
        
        int[] frequency = new int[256];         // 256 possible chars
        
        /* YOUR CODE HERE */
        
        
        // Write results to output file. We've already opened the 
        //  PrintStream (in a try...catch block above), so we just
        //  need to traverse the array, printing it to the
        //  PrintStream. Each output line should look like this:
        //
        //      [ 72] 'H' : 437
        //
        //  where the number in brackets is the ASCII code, the
        //  single quotes indicate the character denoted by that
        //  code, and the number after the ':' is that character's
        //  frequency.
        // However, ASCII includes a number of non-printable
        //  characters. The codes for these characters are 0 - 31
        //  and 127. In your array-traversal printing loop, if
        //  you're at one of these places you should just print out
        //  a line like this:
        //
        //      [  8]     : 0
        //
        //  Note that the brackets and ':' should line up nicely
        //  with those in the other lines. Using printf will make
        //  this easy.
        //
        
        /* YOUR CODE HERE */
        
        
        // Inform the user when done (print summary stats). Print same
        //  stats to the file. Supposing the output file was named 
        //  "charcount.out", the line should look like:
        //
        //  52311 characters counted in 3208 lines. Detail in 'charcount.out'.
        //
        
        /* YOUR CODE HERE */
        
        
    } // end main
    
} // end class