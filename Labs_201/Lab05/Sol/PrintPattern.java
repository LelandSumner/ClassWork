public class PrintPattern {


    public static void main (String [] args) {
	System.out.println("Your output should look like the following: ");
	System.out.println("***** ***** ***** ***** ***** ");
	System.out.println("^^^^^^^ ^^^^^^^ ^^^^^^^ ^^^^^^^ ^^^^^^^ ^^^^^^^ ^^^^^^^ ");
	System.out.println();
	System.out.println("@ ");

	System.out.println("\nYour output: ");
        printPattern(5, "*");
        printPattern(7, "^");
	printPattern(0, "#");
	printPattern(1, "@");
    }


    // put code for printPattern here
    public static void printPattern(int reps, String c) {
        for (int i = 1; i <= reps; i++) {
            for (int j = 1; j <= reps; j++) {
                System.out.print(c);
	    }
	    System.out.print(" ");
	}
	System.out.println();
    }
}
