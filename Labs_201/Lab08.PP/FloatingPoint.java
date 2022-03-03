public class FloatingPoint {
    
    public static void main(String[] args) {
        tryIt(0.01, 0.05);
        
//        tryIt(0.01, 0.06);
        
//        tryIt(0.01, 0.14);

//        tryIt(-3.2, -9.6);
    }
    
    // Print the multiples of x, up until it reaches the
    //  given limit.
    public static void tryIt(double x, double limit) {
        System.out.println("Printing multiples of " + x +
                " until (but not including) the limit " + limit + ":");
        double multiple = x;
        for (/* */; multiple != limit; multiple += x) {
            System.out.println(multiple);
        }
    }
}