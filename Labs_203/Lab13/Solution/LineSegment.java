// Checkpoint 6, 7
public class LineSegment {

    Point endPoint1;
    Point endPoint2;

    public LineSegment (Point p1, Point p2) {
	this.endPoint1 = p1;
	this.endPoint2 = p2;
    }

    public String toString () {
	return "[" + endPoint1 + ", " + endPoint2 + "]";
    }

    public double length () {
	return endPoint1.distance(endPoint2);
    }

}
