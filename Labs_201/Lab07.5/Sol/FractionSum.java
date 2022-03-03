public class FractionSum {

    public static void main (String [] args) {
	System.out.println("fractionSum(1) should return 1.0  and you get " +
			   fractionSum(1));
	System.out.println("fractionSum(2) should return 1.5  and you get " +
			   fractionSum(2));
	System.out.println("fractionSum(15) should return 3.3182289932289937  and you get " +
			   fractionSum(15));
    }


    // put fractionSum() here
    public static double fractionSum (int n) {
	double sum = 0;
	for (int i = 1; i <= n; i++) {
	    sum  = sum + 1.0/i;
	}
	return sum;
    }


}