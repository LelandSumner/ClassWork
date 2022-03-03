public class UsePoint4 {

    public static void main (String [] args) {

        // When uncommented, these should NOT compile
        // withinAMillionth(1.0, 1.00000001);
        // withinAMillionth(1.0, 1.0001);

        Point p = new Point();
        System.out.println("p = " + p);

        Point q = new Point(-5, 6);
        System.out.println("q = " + q);

        Point r = new Point(10, -12);
        System.out.println("r = " + r);

        Point s = new Point(5, -2);
        System.out.println("s = " + s);

        System.out.println("p, q, r colinear? " + p.isColinear(q, r));
        System.out.println("q, r, s colinear? " + q.isColinear(r, s));

    }

}
