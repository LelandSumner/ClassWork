import java.util.*;

public class Equation {
    public static void main (String [] args) {

        System.out.print("Enter x1 and y1: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        // get the slope
        double slope = slope(x1, y1, x2, y2);
        System.out.print("The equation of a line through ");
        System.out.println(pointAsString(x1, y1) + " and " +
                           pointAsString(x2, y2) + " is:  " + 
                           equation(x1, y1,  slope) );

    }

    // put method pointAsString()  from Slope1.java here



    // put method slope from Slope2.java here


    // put method equation here


}
