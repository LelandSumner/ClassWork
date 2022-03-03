import java.util.*;

public class LongestName {

    public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	longestName(sc, 5);
	// Enter: roy DANE Erik SteFaNiE LaurA
	// Output should be: Stephanie's is longest
	longestName(sc, 7);
	// Enter: TrEnt rita JORDAN craig leslie YUKI TaNnEr
	// Output should be: Jordan's name is longst
	//                   (There was a tie!)
	longestName(sc, 1);
	// Enter: ALliSOn
	// Output should be: Allison's name was longest
	longestName(sc, 2);
	// Enter: eric LISA
	// Output should be: Eric's names was longest
	//                   (There was a tie!)

    }

    // put longestName() here
    public static void longestName(Scanner sc, int n) {
	String maxName = "";
	int tie = 0;
	for (int i = 1; i <= n; i++) {
	    System.out.print("name #" + i + "? ");
	    String name = sc.next();
	    if (name.length() > maxName.length()){
		maxName = name;
		tie = 0;
	    } else if (name.length() == maxName.length()){
		tie++;
	    }
	}
	maxName = maxName.toLowerCase();
	String first = maxName.substring(0,1);
	first = first.toUpperCase();
	maxName = first + maxName.substring(1);
	System.out.println(maxName + "'s name is longest");
	if (tie > 0)
	    System.out.println("(There was a tie!)");
    }
}