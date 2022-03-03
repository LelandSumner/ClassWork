/*
  Name: Leland Sumner
  Course: CIS 203 - Computer Science II
  Assignment: 4
  Due: 3/15/18
*/
import java.util.*;

public class WaysToClimb{
    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        //passes integer to public method
        wtc(n);
    }
    
    public static void wtc(int n){
        //creates an ArrayList
        ArrayList<Integer> path = new ArrayList<Integer>();
        //passes integer and ArrayList to private method
        wtc(n, path);
    }
    private static void wtc(int n, ArrayList<Integer> path){
        if( n == 0)             //base case: 0 steps left
            //prints ArrayList
            System.out.println(path);
        else{
            //take 1 step
            path.add(1);
            //recursion with 1 less step
            wtc(n-1, path);
            //backtrack
            path.remove(path.size()-1);
            if (n >1){
                //take 2 steps if possible
                path.add(2);
                //recursion with 2 less steps
                wtc(n-2, path);
                //backtrack
                path.remove(path.size()-1);
            }
        }
    }
}
