import java.util.*;

public class Greetings {

    public static void main (String [] args) {
	System.out.print("Enter a name <first> <last>: ");
	// read in the full name as one string
	Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();
        greetings(fullName);
    }

    public static void greetings(String name) {
	int pos = name.indexOf(" ");
	String first = name.substring(0,pos);
	System.out.println("Hello, " + first);
    }
}
