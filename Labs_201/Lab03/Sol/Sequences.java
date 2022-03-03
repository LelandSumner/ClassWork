public class Sequences {

    public static void main (String [] args) {

        // SOLUTION
	// print 4, 19, 34, 49, 64, 79, 94, 109, 124, 139
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(15*i - 11);
            System.out.print(" ");
	}
        System.out.println();

	// print 30, 20, 10, 0, -10, -20, -30, -40, -50, -60
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(-10*i + 40);
            System.out.print(" ");
	}
        System.out.println();

	// print -7, -3, 1, 5, 9, 13, 17, 21, 25, 29
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(4*i - 11);
            System.out.print(" ");
	}
        System.out.println();

	// print 97, 94, 91, 88, 85, 82, 79, 76, 73, 70
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(-3*i + 100);
            System.out.print(" ");
	}
        System.out.println();
    }

}
