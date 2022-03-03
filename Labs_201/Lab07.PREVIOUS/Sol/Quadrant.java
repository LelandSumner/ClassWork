public class Quandrant {

    public static void main (String [] args) {
        System.out.println(quadrant(12.4, 17.8));
	System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(-15.2, -3.1)); 
        System.out.println(quadrant(4.5, -4.5)); 
        System.out.println(quadrant(0.0, 0.0));
        System.out.println(quadrant(12.5, 0.0));
        System.out.println(quadrant(0.0, 2.3));
    }

    public static int quadrant(double x, double y) {
       if (x > 0 && y > 0)
          return 1;
       if (x < 0 && y > 0)
          return 2;
       if (x < 0 && y < 0)
          return 3;
       if (x > 0 && y < 0)
          return 4;
       return 0;
    }   
}
