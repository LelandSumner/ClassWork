/*
 *  This program demonstrates some of Java's built-in Math
 *      features, and how to cleanly format numbers using
 *      System.out.printf().
*/

public class Cosines {

    public static void main(String[] args) {
        /* print cosines of 10-degree angle increments */
        for (int angle = 0; angle <= 360; angle += 30) {
            double radians_angle = Math.PI * (angle / 180.0);
            System.out.print("Cosine of ");
            System.out.print(angle);
            System.out.print(" degrees = ");
            System.out.println(Math.cos(radians_angle));
        }
    }

} // end class