import java.awt.*;


public class PointDemo2 {
    public static void main (String [] args) {

        Point p = new Point(3,4);
	int a = 5;
	System.out.println("\nin main, BEFORE mystery call, p = " + p +
                           "  a = " + a + "\n");
	mystery(p, a);
	System.out.println("in main AFTER mystery call, p = " + p + 
                           "  a = " + a + "\n");
         
    }

    public static void mystery(Point p, int a) {
        a = a + 1;
	p = new Point(3,4);
        p.move(99,100);
	System.out.println("in mystery, p = " + p + 
                           "  a = " + a + "\n");
    }
}
