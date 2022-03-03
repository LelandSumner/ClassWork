import java.util.*;

public class Season{

    public static void main (String [] args) {
	System.out.println("season(1,2) should be Winter and is: " + 
			   season(1,2));
	System.out.println("season(2,28) should be Winter and is: " + 
			   season(2,28));
	System.out.println("season(3,15) should be Winter and is: " + 
			   season(3,15));
	System.out.println("season(3,16) should be Spring and is: " + 
			   season(3,16));
	System.out.println("season(4,1) should be Spring and is: " + 
			   season(4,1));
	System.out.println("season(6,15) should be Spring and is: " + 
			   season(6,15));
	System.out.println("season(6,16) should be Summer and is: " + 
			   season(6,16));
	System.out.println("season(8,9) should be Summer and is: " + 
			   season(8,9));
	System.out.println("season(9,15) should be Summer and is: " + 
			   season(9,15));
	System.out.println("season(9,16) should be Fall and is: " + 
			   season(9,16));
	System.out.println("season(10,31) should be Fall and is: " + 
			   season(10,31));
	System.out.println("season(12,15) should be Fall and is: " + 
			   season(12,15));
	System.out.println("season(12,16) should be Winter and is: " + 
			   season(12,16));
    }

    // put season() here
    public static String season (int month, int day) {
	if (month < 3 || month == 3 && day <= 15) {
	    return "Winter";
	} else if (month < 6 || month == 6 && day <= 15) {
	    return  "Spring";
        } else if (month < 9 ||  month == 9 && day <= 15) {
	    return "Summer";
	} else if (month < 12 || month == 12 && day <= 15) {
	    return "Fall";
	} else {
	    return "Winter";
	}
    }
}	
