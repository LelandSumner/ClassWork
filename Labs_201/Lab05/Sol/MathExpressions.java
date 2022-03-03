public class MathExpressions {
    public static void main (String [] args) {
	double grade = 2.7;
	Math.round(grade);
	System.out.println("(a) " + grade);
	grade = Math.round(grade);
	System.out.println("(b) " + grade);
	double min = Math.min(grade, Math.floor(2.9));
	System.out.println("(c) " + min);
	double x = Math.pow(2, 4);
	System.out.println("(d) " + x);
	x = Math.sqrt(64);
	System.out.println("(e) " + x);
	int count = 25;
	Math.sqrt(count);
	System.out.println("(f) " + count);
	count = (int) Math.sqrt(count);
	System.out.println("(g) " + count);
	int a = Math.abs(Math.min(-1, -3));
	System.out.println("(h) " + a);
    }


}
