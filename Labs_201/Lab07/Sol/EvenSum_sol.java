/*
Exercise 4.9: evenSumMax 

    Add to the following program a method named evenSum that 
prompts the user for many integers and prints the sum of the even numbers entered,
and the and the biggest of the even numbers. 

You may assume that the user types at least one non-negative even integer. 

Test your method on the following examples, the format of which you must match exactly:

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18


how many integers? 2
next integer? 3
next integer? 2
even sum = 2
even max = 2

*/

public class evenSumMax{
    public static void main(String[] args){
	evenSum();
	evenSum();
    }

  
    public static void evenSum() {
	Scanner console = new Scanner(System.in);
	System.out.print("how many integers? ");
	int count = console.nextInt();
	int sum = 0;
	int max = 0;
	for (int i = 1; i <= count; i++) {
	    System.out.print("next integer? ");
	    int next = console.nextInt();
	    if (next % 2 == 0) {
		sum = sum + next;
		if (next > max) {
		    max = next;       // or,  max = Math.max(max, next);
		}
	    }
	}
	System.out.println("even sum = " + sum);
	System.out.println("even max = " + max);
    }      


    
}