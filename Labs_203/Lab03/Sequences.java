public class Sequences {

    public static void main (String [] args) {

        // SOLUTION
	// print 4, 19, 34, 49, 64, 79, 94, 109, 124, 139
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(4+(i-1)*15);
            System.out.print(" ");
	}
        System.out.println();

	// print 30, 20, 10, 0, -10, -20, -30, -40, -50, -60
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(30-(i-1)*10);
            System.out.print(" ");
	}
        System.out.println();

	// print -7, -3, 1, 5, 9, 13, 17, 21, 25, 29
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(-7+(i-1)*4);
            System.out.print(" ");
	}
        System.out.println();

	// print 97, 94, 91, 88, 85, 82, 79, 76, 73, 70
        // using an expression in terms of i
        for (int i = 1; i <= 10; i++) {
            System.out.print(97-(i-1)*3);
            System.out.print(" ");
	}
        System.out.println();
    }

}
