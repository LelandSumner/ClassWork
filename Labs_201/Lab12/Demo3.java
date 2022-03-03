import java.awt.*;

public class Demo3 {

    public static void main (String [] args) {
        Point [] a = {new Point(2,3), new Point(-5,2), new Point(1,2)};        
        Point [] b = arrayCopy(a);
        printArray("a", a);
        printArray("b", b);
        a[0].translate(-2, -3);
        printArray("a", a);
        printArray("b", b);
    }

    public static Point [] arrayCopy(Point [] source) {
	Point [] copy = new Point[source.length];
        for (int i = 0; i < source.length; i++)
            copy[i] = source[i];
        return copy;
    }

    public static void printArray(String name, Point [] a) {
         System.out.println("Array " + name + ":");
	 String sep = "";
         for (int i = 0; i < a.length; i++) {
	     System.out.print(sep + a[i]);
	     sep = ", ";
	 }
         System.out.println();
    }
    
}
