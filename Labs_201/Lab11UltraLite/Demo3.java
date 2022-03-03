import java.util.*;


public class Demo3 {

    public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: (> 0): " );
	int n = sc.nextInt();
	System.out.print("Enter the end of the range of values (0-?): ");
	int range = sc.nextInt();
        int [] array = randomArray(n, range);
        System.out.println(Arrays.toString(array));       
	//    System.out.println("Number of odd values: " + oddsInArray(array));

    }

    // put randomArray() here

    // put oddsInArray() here


}
