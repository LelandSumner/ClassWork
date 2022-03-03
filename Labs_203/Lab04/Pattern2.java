public class Pattern2 {
  public static final int H=10;
    public static void main (String [] args) {
        printPattern();
    }
    
    public static void printPattern() {
        for (int row = 1; row <= H; row++) {
	  for (int i=1; i<= (row-1)*2; i++){
	  System.out.print("\\");  // print back slashes \\
	  }
	  for (int j=1; j<= (H*4-2)+(row-1)*(-4);j++) {
	  System.out.print("!");   // print exclamation points
	  }
	  for (int k=1; k<= (row-1)*2; k++){
	  System.out.print("/"); // print forward slashes //
	  }
	  System.out.println();  // end the line

        } // end outer for loop

    } // end method

} // end class
