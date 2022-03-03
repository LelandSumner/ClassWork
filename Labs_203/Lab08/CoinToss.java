import java.util.*;

public class CoinToss {

    public static void main (String [] args) {
        coinToss();
    }    

    public static void coinToss() {
     int head = 0 ;
     Random n = new Random();
     while (head !=3) {
     int toss = n.nextInt(2);
     
     if (toss == 1) {
         System.out.print ("H ");
         head++;
     } else {
         System.out.print ("T ");
         head = 0;
    }
    }
    System.out.println("");
    System.out.println("Three heads in a row!");
    
    }
    
   

}
