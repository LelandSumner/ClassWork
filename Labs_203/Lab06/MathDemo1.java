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
    
    public static int largerAbsVal(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return (int)Math.max (x,y);
    }

}
