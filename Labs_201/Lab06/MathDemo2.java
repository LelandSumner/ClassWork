public class MathDemo2 {

    public static void main (String [] args) {

	int a = -7;
        int b = 5;
        int c = 45;
        int largest = largestAbsVal(a, b, c);
        System.out.println ("Of " + a + ", " + b + ", and " + c + 
                             ", the largest absolute value is " + largest);

        a = -77;
        b = 15;
        c = 45;
        largest = largestAbsVal(a, b, c);
        System.out.println ("Of " + a + ", " + b + ", and " + c + 
                             ", the largest absolute value is " + largest);

        a = 45;
        b = -88;
        c = 12;
        largest = largestAbsVal(a, b, c);
        System.out.println ("Of " + a + ", " + b + ", and " + c + 
                             ", the largest absolute value is " + largest);


    }


    // put largestAbsVal() here

}
