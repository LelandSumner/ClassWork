public class PrintNumbers {


    public static void main (String [] args) {
	System.out.println("Your output should look like the following: ");
	System.out.println("[1] [2] [3] [4] [5] ");
	System.out.println("[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12]");
	System.out.println("[1] ");

	System.out.println("\nYour output: ");
        printNumbers(5);
        printNumbers(12);
	printNumbers(1);
    }


    // put code for printNumbers here
    public static void printNumbers (int max) {
	for (int i = 1; i <= max; i++) {
	    System.out.print("[" + i + "] ");
	}
	System.out.println();
    }
}
