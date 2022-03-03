import java.io.*;
import java.util.*;

public class StripHTML {

    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = openFile();
        while (input.hasNextLine()) {
            Scanner line = new Scanner(input.nextLine());
            while (line.hasNext()) {
                String sub = line.next();
                if (!sub.startsWith("<")) {
                    System.out.print(sub + " ");
                }
            }
        System.out.println();
        }
            

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
