import java.util.*;
public class MathDemo2 {
    public static void main (String [] args) {
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter the first of three integers: ");
	int a = console.nextInt();
	System.out.print("Enter the second integer: "); 
        int b = console.nextInt();
        System.out.print("Enter the third: ");
        int c = console.nextInt();
        int largest = largestAbsVal(a, b, c);
        System.out.println ("Of " + a + ", " + b + ", and " + c + 
                             ", the largest absolute value is " + largest);
    }
    
     public static int largerAbsVal(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return (int)Math.max (x,y);
    }
    
    public static int largestAbsVal (int x, int y, int z) {
        return largerAbsVal(largerAbsVal(x, y), z);
    }
}
    
    
