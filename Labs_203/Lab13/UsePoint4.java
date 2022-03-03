public class UsePoint4 {

    public static void main (String [] args) {

	Point p = new Point(-1, 5);
        System.out.println("p = " + p);

        Point q = new Point(2, 2);
        System.out.println("q = " + q);

        Point r = new Point(7, -3);
        System.out.println("r = " + r);

        Point s = new Point(1, -1);
        System.out.println("s = " + s);

        System.out.println("p, q, r colinear? " + p.isColinear(q, r));
        System.out.println("q, s, r colinear? " + q.isColinear(s, r));

    }

}
