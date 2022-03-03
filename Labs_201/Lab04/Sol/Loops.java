public class Loops {

    /* ============================================================
     * CLASS CONSTANTS
     */
    public static final String START_MSG =
            "These are the patterns printed by the four loops.";
            
    public static final String END_MSG = "Now wasn't that fun?";


    /* ============================================================
     * Main method
     */
    public static void main(String[] args) {
        System.out.println(START_MSG);
        
        System.out.println("\nLoop 1");
        printLoop1();
        
        System.out.println("\nLoop 2");
        printLoop2();
        
        System.out.println("\nLoop 3");
        printLoop3();
        
        System.out.println("\nLoop 4");
        printLoop4();
        
        System.out.println("\n" + END_MSG);
        
    } // end main

    /* ============================================================
     * Other methods
     */
    public static void printLoop1() {
	for (int i=1 ; i<5 ; i++) {
	    System.out.print("*");
	    for (int j=1 ; j<i ; j++) {
		System.out.print("-");
	    }
	    for (int j=1 ; j<5-i ; j++) {
		System.out.print("+");
	    }
	    System.out.println("*");
	}
    }

    public static void printLoop2() {
	for (int i=1 ; i<=3 ; i++) {
	    for (int j=1 ; j<=2 ; j++) {
		for (int k=1 ; k<=4 ; k++) {
		    System.out.print("*");
		}
		System.out.print("-");
	    }
	    System.out.println("!");
	}
    }
    
    public static void printLoop3() {
	for (int i=1 ; i<=3 ; i++) {
	    for (int j=1 ; j<=i ; j++) {
		for (int k=1 ; k<=i ; k++) {
		    System.out.print("*");
		}
		System.out.print("-");
	    }
	    System.out.println("!");
	}
    }
    
    public static void printLoop4() {
	for (int i=1 ; i<=3 ; i++) {
	    for (int j=1 ; j<=i ; j++) {
		for (int k=1 ; k<=j ; k++) {
		    System.out.print("*");
		}
		System.out.print("-");
	    }
	    System.out.println("!");
	}
    }

} // end class
