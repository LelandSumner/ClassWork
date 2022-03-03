import java.util.*;

public class LookThenLeap {

    public static void main (String [] args) {

	double temp = getDouble("Enter the temperature: ");
        double rainfall = getDouble("Enter the rainfall: ");
        System.out.println("The temperature is  " + temp + " degrees.");
        System.out.println("The rainfall is  " + rainfall + " inches.");
    }

    public static double getDouble(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        while (!sc.hasNextDouble()) {
           sc.next();
           System.out.println("Input not a real number");
           System.out.print(s);
        }
        return sc.nextDouble();
    }

}
