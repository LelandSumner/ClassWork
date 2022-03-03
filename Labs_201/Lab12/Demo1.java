public class Demo1 {

    public static void main (String [] args) {
        String [] words = new String[10];
        // put code here
        print(words);
    }

    public static void print(String [] s) {
	for (int i = 0; i < s.length; i++)
	    System.out.print(s[i] + " ");
        System.out.println();
    }
}
