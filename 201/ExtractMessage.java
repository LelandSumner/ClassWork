/*
Leland Sumner
CIS 201
Section 003
Assignment 10.5
*/
import java.util.*;
import java.io.*;

public class ExtractMessage {

    public static void main (String[] args) throws FileNotFoundException {
    
        Scanner message = new Scanner(findFile());
        int[] code = new int[200];
        int[] extract = extract(message, code);
        String hidden = decode(extract);
        System.out.println(hidden);
        
    }
    //asks for file name until given one that exists
    public static File findFile() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String name = input.next();
        File message = new File(name);
        while (!(message.exists())) {
            System.out.println(name + " does not exists.");
            System.out.print("Enter a file name: ");
            name = input.next();
            message = new File(name);
        }
        return message;
    }
    //extracts all int from file and puts them into an int array
    public static int[] extract (Scanner message, int[] code) {
        int count = 0;
        while (message.hasNext()) {
            if (message.hasNextInt()) {
                code[count] = message.nextInt();
                count++;
            } else {
                message.next();
            }
        }
        //makes new arrray for coded message
        int[] extract = new int[count];
        for (int i = 0; i < count; i++) {
            //subtracts length from array
            extract[i] =code[i] - count;
        }
        return extract;
    }
    //converts array to string and returns hidden message
    public static String decode(int[] array) {
        String hide = "";
        for (int i = 0; i < array.length; i++) {
            char ascii = (char) array[i];
            hide += ascii;
        }
        return hide;
    }
    
}
