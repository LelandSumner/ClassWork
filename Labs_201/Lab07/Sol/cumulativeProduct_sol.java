/*
self check 4.17

 Complete the method below to produce a cumulative product by multiplying together 
   many numbers that are read from the console. Do not change the main method. Test
   your code using the examples below.
   Match the following format:

How many numbers? 4
Next number --> 7
Next number --> 2
Next number --> 3
Next number --> 15
Product = 630

How many numbers? 0
Product = 1

How many numbers? 3
Next number --> -3
Next number --> 3
Next number --> 10
Product = -90

*/

public class CumulativeProduct{
    public static void main(String[] args){
	cumProduct();
	cumProduct();
	cumProduct();
    }

    public static void cumProduct{
	Scanner console = new Scanner(System.in);
	System.out.print(" How many numbers? ");

	int n = console.nextInt();
	int product = 1;

	for ( int i = 0; i < n; i++ ){
	    
	    System.out.print("Next number --> ");
	    int x = console.nextInt();
	    
	    product *= x;
	}    

	System.out.println( "Product = " + product );


    }
}