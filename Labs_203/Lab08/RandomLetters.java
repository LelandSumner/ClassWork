import java.util.*;

public class RandomLetters {

    public static void main (String [] args)  {
        for (int i = 1; i <= 10; i++) {
            //System.out.println(randomLetter());
	    System.out.println(randomLetterStream());
	}
    }

    public static char randomLetter() {
     Random rand = new Random(); 
     char m = 'a';
    int a = rand.nextInt(2);
    if (a==1) {
     m = (char) (rand.nextInt(26) + 'a');
     }
     
     else {
     m = (char) (rand.nextInt(26) + 'A');
     }
     return m;
}
    public static String randomLetterStream() {
    Random rand = new Random();
    String q = "";
    int m = rand.nextInt(9) + 4;
    for(int i=1 ; i <= m; i++) {
       q = q + randomLetter();
      }
      return q;
      }

}
