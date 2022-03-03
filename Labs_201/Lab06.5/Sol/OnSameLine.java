import java.util.*;

public class OnSameLine {
    public static void main (String [] args) {

        System.out.print("Enter x1 and y1: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.print("The points: " );
        System.out.print(pointAsString(x1, y1) + ", ");
        System.out.print(pointAsString(x2, y2) + ", and ");
        System.out.print(pointAsString(x3, y3) + " are ");
        if (!isColinear(x1, y1, x2, y2, x3, y3)) {
	    System.out.print("NOT ");
	}
        System.out.println("colinear.");

    }


    // put method pointAsString()  from Slope1.java here
    public static String pointAsString(int x, int y) {
        return "(" + x + ", " + y + ")";
    }


    // put method slope() here from Slope2.java
    public static double slope(int x1, int y1, int x2, int y2) {
	double diffy = y2 - y1;
	double diffx = x2 - x1;
        return diffy / diffx;
    }

    // put method isColinear here
    public static boolean isColinear(int x1, int y1, int x2, int y2, 
                                     int x3, int y3) {
        double m1 = slope(x1, y1, x2, y2);
        double m2 = slope(x2, y2, x3, y3);
        return (m1 == m2);
    }


}
