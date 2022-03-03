import java.util.*;

public class Slope1 {
    public static void main (String [] args) {

        System.out.print("Enter x1 and y1: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("The slope of a line between ");
        System.out.println(pointAsString(x1, y1) + " and " +
                         pointAsString(x2, y2) + " is... " );

    }

    // put method pointAsString() here
    public static String pointAsString(int x, int y) {
        return "(" + x + ", " + y + ")";
    }




}
