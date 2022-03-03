public class Runaway {

    public static void main (String [] args) throws InterruptedException {
        System.out.println("This was an okay program until...");
        Thread.sleep(2000);
        jack();
        
    }
 
    public static void jack() {
	System.out.println("All work and no play makes Jack a dull boy.");
        jill();    
    }

    public static void jill() {
	System.out.println("Jack and Jill went up the hill to");
	System.out.println("fetch a pail of water.");
        jack();
    }
}
