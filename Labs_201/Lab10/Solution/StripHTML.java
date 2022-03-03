import java.io.*;
import java.util.*;

public class StripHTML {

    public static void main (String [] args) throws FileNotFoundException {
        File inFile = openFile();
	File outFile = getOutFile(inFile);
	Scanner input = new Scanner(inFile);
	PrintStream output = new PrintStream(outFile);

        while (input.hasNextLine()) {
	    String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
		String token = lineScan.next();
                if (!token.startsWith("<") || !token.endsWith(">")) {
                    output.print(token + " ");
		}
	    }
            output.println();
	}
    }


    public static  File getOutFile (File inFile) {
	String inFileName = inFile.getName();
	String outFileName = inFileName.substring(0, inFileName.indexOf("html"));
	outFileName = outFileName + "txt";
	return new File(outFileName);
    }



    public static File openFile() throws FileNotFoundException {
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
        return inFile;
    }

}
