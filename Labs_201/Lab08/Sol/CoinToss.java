import java.util.*;

public class CoinToss {

    public static void main (String [] args) {
        coinToss();
    }    


    public static void coinToss() {
        String toss1 = "";
        String toss2 = "";
        String toss3 = toss();
        while (!(toss1.equals("H") && toss2.equals("H") && toss3.equals("H"))) {
	    System.out.print(toss3 + " ");
            toss1 = toss2;
            toss2 = toss3;
            toss3 = toss();
	}
        System.out.println(toss3);
        System.out.println("\nThree heads in  a row!");
    }

    public static String toss() {
           Random rand = new Random();
           if (rand.nextInt(2) == 0) {
		return "H";
	    } else {
		return "T";
	    }
    }
}
