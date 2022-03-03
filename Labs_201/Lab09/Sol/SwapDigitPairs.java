import java.util.*;

public class SwapDigitPairs {

 
    public static void main (String [] args) {

	reportOn(482596,845269);
        reportOn(482596,845269);
        reportOn(1234567,1325476);
        reportOn(29107,21970);
        reportOn(456,465);
        reportOn(9898,8989);
        reportOn(48,84);
        reportOn(120011021,102100112);
        reportOn(200000000,200000000);
        reportOn(5,5);
        reportOn(0,0);

    }

    public static void reportOn(int n, int correct) {
	System.out.print("swapDigitPairs(" + n + ") should be " + correct +
                           " and your return is " + swapDigitPairs(n));
	System.out.println(" " + (swapDigitPairs(n) == correct));
    }


    public static int swapDigitPairs (int n) {
        int result = 0;
        int place = 1;
        while (n > 9) {
            int units = n % 10;
            n = n / 10;
            int tens = n % 10;
            n = n / 10;
            int next2 = 10 * units + tens;
            result = next2 * place + result;
	    place = place * 100;
        }
        result = place * n + result;
        return result;
    }
}
