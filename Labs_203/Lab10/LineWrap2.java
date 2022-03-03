import java.io.*;
import java.util.*;

public class LineWrap2 {

    public static void main (String [] args) throws FileNotFoundException {
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
        input = new Scanner(inFile);
        lineWrap(input, fileName);
    }

    public static void lineWrap(Scanner sc, String name) throws FileNotFoundException {
        PrintStream file = new PrintStream(new File(name + ".wrp"));
        while (sc.hasNextLine()) {
	    String line = sc.nextLine();
            if (line.length() > 60) {
		file.println(line.substring(0,60));
                file.println(line.substring(60, line.length()));
	    } else
                file.println(line);
	}

    }
}
