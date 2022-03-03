import java.util.*;

public class Greetings {

    public static void main (String [] args) {
	System.out.print("Enter a name <first> <last>: ");
	Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();
        greetings(fullName);
    }

    public static void greetings (String full) {
        full = full.substring (0,full.indexOf(" "));
        System.out.println ("Hello, " + full);
    }
}
