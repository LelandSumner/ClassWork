import java.util.*;

public class EvenSumMax {

    public static void main (String [] args) {
	evenSum();
	// Enter 4 then values: 2 9 18 4
	// You should get even sum 24 even max 18
	evenSum();
	// Enter 7 then values: -2 180 30007 5 9000 419 9000  
	// You should get even sum 18178 even max 9000
	evenSum();
	// Enter 1 then the value: 42
	// You should get even sum 42 and even max 42
    }

    // put evenSum() here
    public static void evenSum() {
	Scanner sc = new Scanner(System.in);
	System.out.print("how many integers? ");
	int n = sc.nextInt();
	int sum = 0;
	int max = 0;
	for (int i = 1; i <= n; i++) {
	    System.out.print("next integer? ");
	    int num = sc.nextInt();
	    if (num % 2 == 0) {
		sum += num;
		if (num > max)
		    max = num;
	    }
	}
	System.out.println("even sum = " + sum);
	System.out.println("even max = " + max);
    }

}