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
        System.out.println("Number of odd values: " + oddsInArray(array));

    }

    // put randomArray() here
    public static int [] randomArray(int size, int range) {
        Random rand = new Random();
        int [] a = new int[size];
        for (int i = 0; i < size; i++) {
	    a[i] = rand.nextInt(range);
	}
	return a;
    }

    // put oddsInArray() here
    public static int oddsInArray(int [] a) {
	int count = 0;
	for (int i =0; i < a.length; i++) {
	    if (a[i] % 2 == 1) {
		count++;
	    }
	}
	return count;
    }

}
