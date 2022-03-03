import java.util.*;

public class Collapse {

    public static void main (String [] args) {

        int [] a = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
	System.out.println("array = " + Arrays.toString(a));
	System.out.println("array collapsed = " + Arrays.toString(collapse(a)));
	System.out.println("array = " + Arrays.toString(a));
	System.out.println();
 
	int[] b = {1, 2, 3, 4, 5};
	System.out.println("array = " + Arrays.toString(b));
	System.out.println("array collapsed = " + Arrays.toString(collapse(b)));
	System.out.println("array = " + Arrays.toString(b));
	System.out.println();

	int[] c = {100, -100};
	System.out.println("array = " + Arrays.toString(c));
	System.out.println("array collapsed = " + Arrays.toString(collapse(c)));
	System.out.println("array = " + Arrays.toString(c));
	System.out.println();

	int[] d = {1, 2, 3};
	System.out.println("array = " + Arrays.toString(d));
	System.out.println("array collapsed = " + Arrays.toString(collapse(d)));
	System.out.println("array = " + Arrays.toString(d));
	System.out.println();

	int[] e = {999};
	System.out.println("array = " + Arrays.toString(e));
	System.out.println("array collapsed = " + Arrays.toString(collapse(e)));
	System.out.println("array = " + Arrays.toString(e));
	System.out.println();

	int[] f = {};
	System.out.println("array = " + Arrays.toString(f));
	System.out.println("array collapsed = " + Arrays.toString(collapse(f)));
	System.out.println("array = " + Arrays.toString(f));
	System.out.println();

    }



    public static int [] collapse (int [] a) {
        int [] result;
        if (a.length % 2 == 1) {
            result = new int[a.length / 2 + 1];
            result[result.length-1] = a[a.length -1];
        } else
            result = new int[a.length / 2];

        for (int i = 0; i < a.length/2; i++)
             result[i] = a[2*i] + a[2*i+1];
        return result;
    }

}
