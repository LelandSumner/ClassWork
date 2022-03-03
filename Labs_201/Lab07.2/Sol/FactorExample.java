public class FactorExample {
    public static void main(String[] args) {
        reportQualityPoints(4.0);
        reportQualityPoints(3.5);
        reportQualityPoints(3.0);
        reportQualityPoints(2.5);
        reportQualityPoints(2.0);
        reportQualityPoints(1.5);
        reportQualityPoints(1.0);
        reportQualityPoints(0.5);
        
    }

    public static void reportQualityPoints(double grade) {
        int qualityPts = (int)(grade * 4);
        if (grade >= 1.5) {
            if (grade == 4.0)
		System.out.println("High grade for this class! Woo hoo!");
            else if (grade > 3.0)
                System.out.println("I made the dean's list for this class!");
	} else { // grade 1.0 or less
            System.out.println("Uh-oh..I probably should have " + 
                               "studied a little more.");
            if (grade < 1.0)
                qualityPts = 0;
	}
        System.out.println("For a grade of " + grade + " I received " + 
                           qualityPts + " quality points for this class.");
        System.out.println();
    }
}
