import java.util.*;

public class Demo2 {

    public static void main (String [] args) throws Exception {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter a an integer: ");
        String s = input.next();
        int n = makeInteger(s);
        System.out.println("One more than " + s + " is " + (n + 1));
    }

    public static int makeInteger(String s) throws Exception {
        if (s.length() == 0)
	    throw new Exception("Integer string not found");
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) > '9' || s.charAt(i) < '0')
               throw new Exception("Integer string not found");
        // most be an okay string
        return Integer.parseInt(s);
   }
}
