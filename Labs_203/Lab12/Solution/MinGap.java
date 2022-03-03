import java.util.*;

public class MinGap {

    public static void main (String [] args) {
	int [] a = {2, 4, 6};
	System.out.println(minGap(a));
	int [] b = {};
	System.out.println(minGap(b));
	int [] c = {88};
	System.out.println(minGap(c));
	int [] d = {1, 3, 6, 7, 12};
	System.out.println(minGap(d));
	int [] e = {3, 5, 11, 4, 8, 10};
	System.out.println(minGap(e));

    }


    public static int minGap (int [] a) {
        if (a.length < 2) {
            return 0;
        }
        int minDiff = a[1] - a[0];
        for (int i = 1; i < a.length - 1; i++) {
            int diff = a[i+1] - a[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
     }

}
