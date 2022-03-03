import java.util.*;

public class EX4_1 {

    public static void main(String [] args) {
	// output should all be 'true'
	System.out.println(fractionSum(1) < 1.00001 && fractionSum(1) > .99999);
	System.out.println(fractionSum(2) < 1.50001 && 
                           fractionSum(2) > 1.49999);
	System.out.println(fractionSum(15) < 3.319 && fractionSum(15) > 3.318);

    }

    // Write fractionSum below here...

 
}