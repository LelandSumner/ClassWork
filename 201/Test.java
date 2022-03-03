public class Test {
    public static void main (String[] args) {
        
        Fraction f1 = new Fraction(44,28);
        System.out.println("f1 = " + f1);
        f1.reduce();
        System.out.println("f1 = " + f1);
    }
}