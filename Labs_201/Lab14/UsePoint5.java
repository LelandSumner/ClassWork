public class UsePoint5 {

    public static void main (String [] args) {

        Point p = new Point();
        System.out.println("p = " + p);

        Point q = new Point(-5, 6);
        System.out.println("q = " + q);

        Point r = new Point(10, -12);
        System.out.println("r = " + r);

        Point s = new Point(5, -2);
        System.out.println("s = " + s);

        System.out.println("Number of points in this program: " +
                           getPointPopulation());


    }

}
