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

    public static String season (int month, int day) {
	if (month < 3 || month == 3 && day <= 15 || month == 12 && day >=16) {
	    return "winter";
	} else if (month >= 3 && month <=5 || month == 6 && day <= 15) {
            return "spring";
	} else if (month >= 6 && month <=8 || month == 9 && day <= 15) {
            return "summer";
	} else {
            return "fall";
	}
    }
}
