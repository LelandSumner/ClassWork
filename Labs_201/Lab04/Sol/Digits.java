public class Digits {

    public static final int REPS = 5;
    public static void main (String [] args) {
	printDigits();
    }
    
    public static void printDigits() {
    
        // Put your nested loops here.
	for (int k = 1; k <= REPS; k++) {
	    for (int i = 1; i <= 10; i++) {
		for (int j = 1; j <= REPS; j++) {
		    System.out.print(i-1);
		}
	    }    
	    System.out.println();
	}
    }    
}
