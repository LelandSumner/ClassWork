import java.util.*;

public class LookThenLeap {

    public static void main (String [] args) {

	double temp = getDouble("Enter the temperature: ");
        double rainfall = getDouble("Enter the rainfall: ");
        System.out.println("The temperature is  " + temp + " degrees.");
        System.out.println("The rainfall is  " + rainfall + " inches.");
    }

    public static double getDouble(String words) {
        Scanner console = new Scanner(System.in); 
        System.out.print(words);
        while ( !console.hasNextDouble()) {    
             System.out.println("Input is not a real number");
             console.next();
             System.out.print(words);            
        } 
        return console.nextDouble();

}


}