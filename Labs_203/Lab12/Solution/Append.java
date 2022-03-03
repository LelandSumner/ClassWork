import java.util.*;

public class Append {

    public static void main (String [] args) {
	int [] a1 = {1, 2};
	int [] b1 = {3, 4};
	System.out.println(Arrays.toString(append(a1, b1)));
	int [] a2 = {2, 4, 6};
	int [] b2 = {1, 2, 3, 4, 5};
	System.out.println(Arrays.toString(append(a2, b2)));
	System.out.println(Arrays.toString(append(b2, a2)));
	int [] a3 = {1};
	int [] b3 = {};
	System.out.println(Arrays.toString(append(a3, b3)));
	System.out.println(Arrays.toString(append(b3, a3)));
	int [] a4 = {};
	int [] b4 = {};
	System.out.println(Arrays.toString(append(a4, b4)));
    }



    public static int [] append(int [] a1, int [] a2) {
        int [] result = new int [a1.length + a2.length];
        for (int i = 0; i < a1.length; i++)
            result[i] = a1[i];
        for (int i =0; i < a2.length; i++)
            result[a1.length+i] = a2[i];
        return result;
    }


}
