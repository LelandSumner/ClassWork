import java.util.*;

public class Triangles {

    public static void main (String [] args) {
	System.out.print("Enter three integer sides of a triangle: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       
        int b = sc.nextInt();       
        int c = sc.nextInt();       
        System.out.println(triangleType(a, b, c));
    }

    public static String triangleType(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
	    return "not a triangle";
	}
        else if (a == b && b == c) {
            return "equilateral";
   	}
        else if (a == b || a == c || b == c) {
            return "isosceles";
	}
        else {
	    return "scalene";
	}
        
    }
}
