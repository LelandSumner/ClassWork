public class PrintStrings{
    public static void main(String[] args){
	System.out.println("\nThe output of your program must duplicate the following exactly:\n");
	System.out.println("abcabcabcabcabc");
	System.out.println("w w w w w");
	System.out.println();
	System.out.println();
	System.out.println("---------------\n\n");
	System.out.println("\nHere is your method's output:\n");
	printStrings("abc", 5);
	printStrings("w ", 5);
	printStrings("", 3);
	printStrings("abc", 0);
	printStrings("---", 5);
    }

    
    // write printStrings method here
    public static void printStrings(String text, int n) {
	for (int i = 1; i <= n; i++) {
	    System.out.print(text);
	}
	System.out.println();
    }    
}
