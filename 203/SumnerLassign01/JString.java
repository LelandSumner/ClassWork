/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 1
  Due: 2/6/18
*/
import java.util.*;

public class JString{
    private String word;
    
    public JString(String str){
        word = str.toUpperCase();
    }
    
    public String toString(){
        return word;
    }
    
    public String permute(){
        Random rand = new Random();
        int[] record = new int[word.length()];
        String permutation = "";
        int index =0; 
        for (int i = 0; i < word.length();){
            //chooses a random index (letter) in the word
            index = rand.nextInt(word.length());
            //checks if this index has already been used
            //if so, nothing happens
            if (record[index] == 0){
                //if not, it uses that letter next and records the use of it
                i++;
                permutation += word.charAt(index);
                record[index]++;
            }
        }
        return permutation;
    }
}
