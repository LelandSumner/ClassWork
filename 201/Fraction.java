public class Fraction {
    int numerator;
    int denominator;
    
    public Fraction (int numerator, int denominator) {
        
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public String toString() {
        return (numerator + "/" + denominator);
    }
    
    public void setNumerator (int x){
        numerator = x;
    }
    
    public void setDenominator (int x){
        denominator = x;
    }
    
    public void reduce() {
        int gcd = gcd(denominator,numerator);
        numerator /= gcd;
        denominator /= gcd;
    }
    
    private int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }else {
            while (b != 0) {
                if(a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        }
        return a;
    }
}
