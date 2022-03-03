import java.util.*;

public class Demo3 {

    public static void main (String [] args) {
        int [] data = new int[100];
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        System.out.print("Enter an integer: ");
        while (sc.hasNextInt()) {
            data [count] = sc.nextInt();
            sum += data[count];
            count++;
            System.out.print("Enter an integer: ");
	}


        double ave = sum / count;
        System.out.println("Average: " + ave);

        double std = 0;
        for (int i = 0; i < count; i++)
            std += Math.pow(data[i] - ave, 2);
        std = Math.sqrt(std/count);
        System.out.println("Stand Dev: " + std);
        
    }
}
