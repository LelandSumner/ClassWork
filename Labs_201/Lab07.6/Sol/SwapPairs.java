
public class SwapPairs {
    public static void main (String []args) {
	System.out.println("team --> " + swapPairs("team"));
	System.out.println("example --> " + swapPairs("example"));
	System.out.println("hello there --> " + swapPairs("hello there"));
    }

    public static String swapPairs(String s) {
        String result = "";
	int n = s.length();
	if (n % 2 == 1)
	    n--;
	for (int i = 0; i <n; i+=2) {
	    result = result + s.charAt(i+1) + s.charAt(i);
	}
	if (s.length() % 2 == 1)
	    result = result + s.charAt(n);
	return result;
    }
}