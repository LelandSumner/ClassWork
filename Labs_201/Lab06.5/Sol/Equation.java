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
    public static String pointAsString(int x, int y) {
        return "(" + x + ", " + y + ")";
    }



    // put method slope here
    public static double slope(int x1, int y1, int x2, int y2) {
	double diffy = y2 - y1;
	double diffx = x2 - x1;
        return diffy / diffx;
    }

    // put method equation here
    public static String equation(int x, int y, double m) {
	double b = y - m * x;
        return "y = " + m + "x + " + b;
    }

}
