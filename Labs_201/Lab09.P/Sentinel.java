import java.util.*;

public class Sentinel {

    public static void main (String [] args) throws Exception {
        String prompt = "Enter a word (\"xxx\" to quit): ";
        
        Scanner input = new Scanner(System.in);
        
        String word = "qqq";        // seed the loop (ensure first 
        String newString = "";      // accumulates result
        
        while (!word.equals("xxx")) {
            newString = newString + word + " ";
            System.out.print(prompt);
            word = input.nextLine();
        }
        
        System.out.println(newString);
    }

} // end class
