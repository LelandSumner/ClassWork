/*
Leland Sumner
CIS 201
Section 03
Assognment10
*/
import java.util.*;
import java.io.*;
public class CommentRemove {
    public static void main (String[] args) throws FileNotFoundException {
        String name = fileName();
        File file = new File (name);
        while (!(file.exists())) {  //checks if file exits  
            System.out.println("\""+ name + "\" does not exist.");
            name = fileName();
            file = new File (name);
        }
        write(new Scanner(new File(name)), new PrintStream(new File(name + ".cln")));  //names new file with .cln at end
    }
    public static String fileName() {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the input file name here: ");
        return input.next();
    }
    public static void write (Scanner oldFile, PrintStream newFile) throws FileNotFoundException{
        Boolean inMultiline = false;
        while (oldFile.hasNextLine()) {
            String next;
            do {
                next = oldFile.nextLine();
            }while (inMultiline && !(next.contains("*/")));     //skips to last line of multiline comment
            Scanner line = new Scanner(next);
            while  (line.hasNext()) {
                String word =line.next();
                if (word.equals("//")) {        //skip single line comment
                    line.nextLine();
                } else if (word.equals("/*") || inMultiline) { // multiline comment has started
                    inMultiline = true;
                    if (next.contains("*/")) {      //multiline comment is about to end
                        if (line.equals("*/")) {    //multiline comment has ended
                            line.nextLine();
                        }
                        while(!(word.equals("*/"))) {
                            word = line.next();
                        }
                        inMultiline = false;
                    }
                    
                } else { //not in comment
                    newFile.print(word + " ");
                }
            }
            newFile.println();
        }
    }
}
