

public class Demo2 {

    public static void main (String [] args) {
 
        // How many odd integers between start and end? (You can
        //  assume that start and end positions are both even).
        int size = // ??
        
        // Create an array to hold them
        int [] data  = new int[size];

        // Store successive odd values between start and end into
        //  the array.
	for (int i = 0; i < size; i++)
            data[i] = // ??

        // Print out the result to verify correctness
        System.out.printf("Start = %d, End = %d, Size = %d\n", -6, 38, size);
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + "  ");

        System.out.println();
    }
}
