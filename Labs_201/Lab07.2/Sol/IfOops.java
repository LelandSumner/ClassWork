public class IfOops {

         public static void main(String[] args) {
            int a = 7, b = 42;
            int smaller = minimum(a, b);
            if (smaller == a) {
                System.out.println("a is  smaller!");
            }
         }

         // this method returns the smaller of ints a and b
         public static int minimum(int a, int b) {  
	     int smaller;
            if (a < b) {
               smaller = a;
            } else  {
               smaller = b;
            }
            return  smaller;
         }
}
