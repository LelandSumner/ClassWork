import java.util.*;

public class LeapThenLook {

    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Last name: ");
        String lastName =  sc.nextLine(); 
        
        while (!firstName.equals("Zoey")) {
            System.out.print("First name: ");
            firstName = sc.nextLine();
            System.out.print("Last name: ");
            lastName = sc.nextLine();    
        }
        System.out.println("I finally found " + firstName + " " + lastName);
    }

} // end class
