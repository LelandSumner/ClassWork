
public class Checkpoint5And6 {

    public static void main(String [] args) {
	one();
	System.out.println();
	two();
	System.out.println();
	three();
	System.out.println();
	four();
	System.out.println();
	five(); 
    }

    public static void one() {
	System.out.println("1: ");
       int total = 25;                                      
       for (int number = 1; number <= (total/2); number++) {
           total = total - number;
           System.out.println(total + " " + number);
       }
    }

    public static void two() {
	System.out.println("2: ");
        System.out.println("+----+");        
        for (int i = 1; i <= 3; i++) {
            System.out.println("\\ /");
            System.out.println("/ \\");
        }
        System.out.println("+----+");
    }

    public static void three() {
	System.out.println("3: ");
        for (int i = 1; i <= 3; i++)              
           System.out.println("????");
           System.out.println("!!!!");
     
    }

    public static void four() {
	System.out.println("4: ");
        System.out.println("+----+");          
        for (int i = 1; i <= 3; i++) {
           System.out.print("\\ /");
           System.out.println("/ \\");
        }
        System.out.println("+----+"); 
    }

    public static void five() {
	System.out.println("5: ");
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum = sum + i;
        }
        System.out.println("For i = 1 to 3, the sum is " + sum);
        System.out.println("For i = 1 to 4, the sum is " + sum + 4);
    }

}   // end class
