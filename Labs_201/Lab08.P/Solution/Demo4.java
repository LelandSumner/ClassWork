import java.util.*;

public class Demo4 {

    public static void main (String [] args) throws Exception {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        String newString = "";
        while (!word.equals("xxx")) {
            newString = newString + word + " ";
            System.out.print("Enter a word: ");
            word = input.nextLine();
        }
        System.out.println(newString);
    }

}
