import java.util.*;

public class Name {

    public static void main (String [] args) {
        
        Scanner a = new Scanner (System.in);
	System.out.print("Enter a name <first> <last>: ");
        String fullName = a.nextLine();
	System.out.println("The name is " + convert(fullName));
    }

    public static String convert(String full) {
    
    String first = full.substring(0, 1) +".";
    String last = full.substring (full.indexOf(" ")+1);
    return last + ", " + first;
    }
}
