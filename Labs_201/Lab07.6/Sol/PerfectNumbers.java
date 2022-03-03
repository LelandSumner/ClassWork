
public class PerfectNumbers {
    public static void main (String []args) {
	System.out.println(isPerfect(28));
	System.out.println(isPerfect(99));
	System.out.println(isPerfect(496));
    }

    public static boolean isPerfect( int n ) {
	int sum = 0;
	for (int i = 1; i < n; i++) {
	    if (n % i == 0)
		sum = sum + i;
	}
	return sum == n;
    }
}