public class MathDemo1 {

    public static void main (String [] args) {

	int a = -7;
        int b = 5;
        int larger = largerAbsVal(a, b);
        System.out.println ("Of " + a + " and " + b + ", the larger " +
                            "absolute value is " + larger);

        a = 7;
        b = 15;
        larger = largerAbsVal(a, b);
        System.out.println ("Of " + a + " and " + b + ", the larger " +
                            "absolute value is " + larger);
    }


    // put largerAbsVal() here
    public static int largerAbsVal(int n1, int n2) {
        return Math.max(Math.abs(n1), Math.abs(n2));
    }
}
