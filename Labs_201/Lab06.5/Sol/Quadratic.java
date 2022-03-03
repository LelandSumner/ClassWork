public class Quadratic {
    public static void main (String [] args) {

        System.out.print("The roots of x^2 - 7x + 12 are: ");
	printRoots(1, -7, 12);

        System.out.print("The roots of x^2  + 3x + 2 are: ");
	printRoots(1, 3, 2);

        System.out.print("The roots of -8x^2 + 30x - 7  are: ");
	printRoots(-8, 30, -7);
    }

    // put method printRoots here
    public static void printRoots (int a, int b, int c) {
        double discrim = Math.sqrt(b*b - 4*a*c);
        double x1 = (-b + discrim) / (2*a);
        double x2 = (-b - discrim) / (2*a);
        System.out.println( x1 + "   " + x2);
    }


}
