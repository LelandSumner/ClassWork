public class TimeSpanClient {

    public static void main (String [] args) {
	TimeSpan t1 = new TimeSpan(9, 15);
	TimeSpan t2 = new TimeSpan(0, 30);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);
	System.out.println();

	t1 = new TimeSpan(6, 55);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);
	System.out.println();
	
        t1 = new TimeSpan(11, 55);
	t2 = new TimeSpan(4, 10);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);
	System.out.println();

        t1 = new TimeSpan(4, 23);
	t2 = new TimeSpan(2, 12);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);
	System.out.println();

        t1 = new TimeSpan(0, 59);
	t2 = new TimeSpan(0, 59);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);
	System.out.println();

        t1 = new TimeSpan(2, 1);
	t2 = new TimeSpan(0, 0);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);
	System.out.println();

        t1 = new TimeSpan(0, 1);
	t2 = new TimeSpan(23, 59);
	System.out.println("Adding t2 = " + t2 + " to t1 = " + t1);
        t1.add(t2);
        System.out.println("t1 = " + t1 + " and  t2 = " + t2);

    }
}
