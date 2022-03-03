public class UsePoint5 {

    public static void main (String [] args) {
	Point p = new Point(5,2);
	Point q = new Point(8,6);
	System.out.println("Manhattan distance from p to q: " +
			   p.manhattanDistance(q));
	System.out.println("Manhattan distance from q to p: " +
			   q.manhattanDistance(p));
	System.out.println();

	p = new Point(-15,39);
	q = new Point(-204,78);
	System.out.println("Manhattan distance from p to q: " +
			   p.manhattanDistance(q));
	System.out.println("Manhattan distance from q to p: " +
			   q.manhattanDistance(p));
	System.out.println();

	p = new Point(5, -3);
	q = new Point(5, -3);
	System.out.println("Manhattan distance from p to q: " +
			   p.manhattanDistance(q));
	System.out.println("Manhattan distance from q to p: " +
			   q.manhattanDistance(p));
	System.out.println("Manhattan distance from p to p: " +
			   p.manhattanDistance(p));



    }


}
