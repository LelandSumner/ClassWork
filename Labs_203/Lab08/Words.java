import java.util.*;

public class Words {

    public static void main (String [] args)  {
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
