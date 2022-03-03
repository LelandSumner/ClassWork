public class UsePoint2 {

    public static void main (String [] args) {

	Point p = new Point();
        System.out.println("p = " + p);

        Point q = new Point(-5, 6);
        System.out.println("q = " + q);

        System.out.print("The slope of the line through p and q is: ");
        System.out.println(q.getSlope(p));

        System.out.print("The slope of the line through p and q is: ");
        System.out.println(p.getSlope(q));
    }

}
