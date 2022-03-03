
public class Pow {
    public static void main (String []args) {
	System.out.println("3^4 = " + pow(3,4));
	System.out.println("4^0 = " + pow(4,0));
	System.out.println("5^10 = " + pow(5,10));
    }

    public static int pow (int base, int exp) {
        int prod = 1;
	for (int i = 1; i <= exp; i++) {
	    prod = prod * base;
	}
	return prod;
    }
}