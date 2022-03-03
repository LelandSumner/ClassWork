import java.io.*;
import java.util.*;

public class LineWrap {

    public static void main (String [] args) throws FileNotFoundException {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a file name: ");
        String string = in.next();
        File file = new File(string);
        while (!(file.exists())) {
            System.out.println(string + " not found.");
            System.out.print("Enter a file name: ");
            string = in.next();
            file = new File(string);
        }
        Scanner input = new Scanner(file);
        lineWrap(input);
    }

    public static void lineWrap(Scanner input) {
        while(input.hasNextLine()) {
            String line = input.nextLine();
            if (line.length() > 60) {
                System.out.println(line.substring(0,60));
                System.out.println(line.substring(60));
            } else {
                System.out.println(line);
            }
        }
    }
    
}
