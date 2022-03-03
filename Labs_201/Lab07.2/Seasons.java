import java.util.*;

public class Seasons {

    public static void main (String [] args) {
	System.out.print("Enter a month (1-12), and a day (1-31): ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();       
        int day = sc.nextInt();       
        System.out.println("On " + month + "/" + day + " it is " +
                           season(month, day));
    }

    // put season() here

}
