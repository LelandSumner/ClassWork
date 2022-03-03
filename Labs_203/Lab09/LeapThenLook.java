import java.util.*;

public class LeapThenLook {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        do {
        System.out.print("First name: ");
         firstName = sc.next();
        System.out.print("Last name: ");
         lastName =  sc.next(); 
        }while (!firstName.equals("Zoey"));
        System.out.println("I finally found " + firstName + " " + lastName);
    }

}
