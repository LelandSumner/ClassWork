public class ClamEvolution2 {

    public static void main (String [] args) {
	printEgg();
	mouth();
	printEgg();
	mouth();
	printEgg();
	mouth();
	printEgg();
	mouth();
	bottom();
        printClam();
    }

    public static void printClam() {
	top();
	mouth();
	bottom();
    }

    public static void printEgg() {
	top();
	bottom();
    }


    public static void top() {
        System.out.println("  -------");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void bottom() {
        System.out.println("\\         /");
        System.out.println(" \\       /");
        System.out.println("  -------");
    }

    public static void mouth() {
        System.out.println("-\"-'-\"-'-\"-");
    }

} // end class
