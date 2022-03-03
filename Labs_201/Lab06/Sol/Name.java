import java.util.*;

public class Name {

    public static void main (String [] args) {
	System.out.print("Enter a name <first> <last>: ");
	// read in the full name as one string
	Scanner input = new Scanner(System.in);
        String fullName =  input.nextLine(); 
	System.out.println("The name is " + convert(fullName));
    }

    public static String convert(String fullName) {
	int pos = fullName.indexOf(" ");
	String last = fullName.substring(pos+1);
	return last + ", " + fullName.charAt(0) + ".";
    }
}
