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
        int qualityPts = 0;
        if (grade == 4.0) {
            qualityPts = 16;
            System.out.println("High grade for this class! Woo hoo!");
            System.out.println("I made the dean's list for this class!");
        } else if (grade == 3.5) {
            qualityPts = 14;
            System.out.println("I made the dean's list for this class!");
        } else if (grade == 3.0) {
            qualityPts = 12;
        } else if (grade == 2.5) {
            qualityPts = 10;
        } else if (grade == 2.0) {
            qualityPts = 8;
	} else if (grade == 1.5) {
            qualityPts = 6;
	} else if (grade == 1.0) {
            System.out.println("Uh-oh..I probably should have " + 
                               "studied a little more.");
            qualityPts = 4;
	} else if (grade < 1.0) {
            System.out.println("Uh-oh..I probably should have " + 
                               "studied a little more.");
            qualityPts = 0;
	}
        System.out.println("For a grade of " + grade + " I received " + 
                           qualityPts + " quality points for this class.");
        System.out.println();
    }
}
