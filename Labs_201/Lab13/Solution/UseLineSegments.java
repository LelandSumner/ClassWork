public class UseLineSegments {

    public static void main (String [] args) {

	Point p = new Point();

        Point q = new Point(-5, 6);

        Point r = new Point(10, -12);

        Point s = new Point(5, -2);

        LineSegment s1 = new LineSegment(p, q);
        System.out.println("Line segment s1 = " + s1);
        System.out.println("Line segment s1 length = " + s1.length());

        LineSegment s2 = new LineSegment(r, s);
        System.out.println("Line segment s2 = " + s2);
        System.out.println("Line segment s2 length = " + s2.length());



    }

}
