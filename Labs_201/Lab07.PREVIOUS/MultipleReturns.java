public class MultipleReturns {

    public static void main (String [] args) {
        System.out.println(foo(4));        
        System.out.println(foo(5));        
        System.out.println(foo(-4));        
        System.out.println(foo(-5));        
    }

    public static int foo (int number) {
        int result;
	// if number is even
        if (number % 2 == 0) {
            // if positive
	    if (number >= 0) {
		result = 0;
	    } else { // negative
                result = 1;
	    }
	} else  { // number is odd
            // if positive
	    if (number >= 0) {
		result = 2;
	    } else { // negative
		result = 3;
	    }
	}
        return result;
    }

}
