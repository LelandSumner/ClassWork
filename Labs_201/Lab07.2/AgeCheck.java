import java.util.*;

public class AgeCheck {

    public static void main (String [] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        message(age);
    }
     

    // Possibly prints some message(s) to the user based on the given age
    public static void message(int age) {
        if (age >= 21) {
            System.out.println("You can legally purchase alcohol!");
        } else if (age >= 17) {
            System.out.println("You can purchase a ticket to an " +
                               "R-rated movie.");
        } else if (age >= 16) {
            System.out.println("You can get a driver's license!");
        }
    }

}
