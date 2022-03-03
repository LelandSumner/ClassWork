public class Manhattan{

    public static void main(String[] args){
	Point p22 = new Point(2,2);
	Point p23 = new Point(2,3);
	Point p2n2 = new Point(2,-2);
	Point pn28 = new Point(-2,8);
	Point p22_1 = new Point(2,2);
	Point pn5n3 = new Point(-5,-3);
	
	System.out.println( p22.manhattanDistance( p23 )   + "  <-- should be  1 ");
	System.out.println( p22.manhattanDistance( p22_1 ) + "  <-- should be  0 ");
	System.out.println( p22.manhattanDistance( pn28 )   + "  <-- should be  10 ");
	System.out.println( p22.manhattanDistance( p23 )   + "  <-- should be  1 ");
	System.out.println( p22.manhattanDistance( pn5n3 ) + "  <-- should be  12 ");
    }

	
}
