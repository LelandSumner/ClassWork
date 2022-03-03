import java.util.*;


public class Demo {

 
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two nonnegative integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = Math.abs(x);
        y = Math.abs(y);

        // Point A
        if (y == 0 || x/y >= 1) {
	    System.out.println(x + " >= " + y);
	} // Point B 
	  else {
	    System.out.println(x + " < " + y);
	}
    }

}
