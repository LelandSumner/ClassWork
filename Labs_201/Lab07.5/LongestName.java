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

}