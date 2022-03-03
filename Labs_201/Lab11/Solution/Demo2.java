

public class Demo2 {

    public static final int START = -6;
    public static final int END = 38;

    public static void main (String [] args) {
 
        int size = (END - START)/2;
        int [] data  = new int[size];

	for (int i = 0; i < size; i++)
            data[i] = 2*i + START + 1;

        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");

        System.out.println(); 
    }
}
