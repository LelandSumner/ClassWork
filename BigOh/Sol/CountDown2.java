public class CountDown2 {
    public static void main (String [] args) {
	int n = Integer.parseInt(args[0]);
	int count = 0;
	while (n > 0) {
	    n = n / 2;
	    count++;
	}
	System.out.println(args[0] + " " + count);
    }
}
