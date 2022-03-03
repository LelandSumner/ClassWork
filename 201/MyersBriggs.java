/*
Leland Sumner
CIS 201
Section 003
Assignment 11
*/
import java.util.*;
import java.io.*;
public class MyersBriggs {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner file = new Scanner (new File(args[0]));
        PrintStream results = new PrintStream (new File(args[0].substring(0,args[0].indexOf("."))+".mb"));
        int[] answer = new int[8];
        String name = "";
        String data = "";
        while (file.hasNextLine()) {
            //grabs name
            name = file.nextLine();
            //grabs data for person
            data = file.nextLine();
            answer = process(answer, data);
            results.println(name + ":");
            printAnswers(answer, results);
            //resets array for next person
            for (int i = 0; i < answer.length; i++) {
                answer[i] = 0;
            }
            
        }
    }
    
    // processes answers for person and puts them into an array
    public static int[] process(int[] answer, String data) {
        int[] indans = new int[14];
        // puts tally for individual answers (every ten questions) into an array
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i,i+1).equals("A")) {
                indans[(i % 7) * 2]++;
            }else{
                indans[((i % 7) * 2 ) +1]++;
            }
        }
        //combines answers based on part of personality (I/E, S/N, T/F, J/P)
        answer[0]= indans[0];
        answer[1]= indans[1];
        answer[2]= indans[2]+ indans[4];
        answer[3]= indans[3]+ indans[5];
        answer[4]= indans[6]+ indans[8];
        answer[5]= indans[7]+ indans[9];
        answer[6]= indans[10]+ indans[12];
        answer[7]= indans[11]+ indans[13];
        return answer;
    }
    
    //prints answers and percents
    public static void printAnswers(int[] array, PrintStream results){
        //prints tally of answers
        for (int i = 0; i < array.length/2; i++) {
            results.print(array[i*2] + "A-" + array[i*2 + 1] + "B ");
        }
        results.println();
        int percent = (int)Math.round(((double)array[0]/(array[0]+array[1]))*100);
        int[] personality = new int[4];
        results.print("[" + percent);
        //prints percents and tallies weather higher or lower than 50%
        for (int i = 1; i < (array.length/2); i++) {
            if (percent < 50) {
                personality[i-1]++;
            }
            percent = (int)Math.round(((double)array[i*2]/(array[i*2]+array[i*2+1]))*100);
            
            results.print("%, " + percent);
        }
        percent = (int)Math.round(((double)array[array.length-2]/(array[array.length-2] +array[array.length-1]))*100);
        if (percent < 50) {
            personality[3]++;
        }
        results.println("%] = " + personalize(personality));
    }
    
    //returns pesonality of person
    public static String personalize(int[] personality) {
        String person = "";
        if(personality[0] == 0) {
            person+= "I";
        }else{
            person+= "E";
        }
        if(personality[1] == 0) {
            person+= "S";
        }else{
            person+= "N";
        }
        if(personality[2] == 0) {
            person+= "T";
        }else{
            person+= "F";
        }
        if(personality[3] == 0) {
            person+= "J";
        }else{
            person+= "P";
        }
        return person;
    }
}
