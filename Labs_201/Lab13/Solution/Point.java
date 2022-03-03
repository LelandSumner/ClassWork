public class Point {

    // class data field
    static int numPoints;

    // object data fields
    int x;
    int y;

    public Point (int initX, int initY) {
	this.x = initX;
        this.y = initY;
        numPoints++;
    }

    // Checkpoint 1
    public Point () {
        this(0,0);
    }

    // Checkpoint 5
    public static int getPointPopulation() {
	return numPoints;
    }

    // Checkpoint 2 and 3
    public double getSlope (Point p) throws IllegalArgumentException {
        if (p.x == this.x)
	    throw new IllegalArgumentException();
	return (p.y - this.y) / (double) (p.x - this.x);
    }

    // Checkpoint 4
    public boolean isColinear(Point p, Point q) {
        return (this.getSlope(p) == p.getSlope(q)); 
    }

    public void translate (int diffx, int diffy) {
	this.x += diffx;
        this.y += diffy;
    }

    public void setLocation(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // distance from this point to another
    public double distance(Point p) {
	double dist = (this.x - p.x)*(this.x - p.x) + 
                      (this.y - p.y)*(this.y - p.y);
        dist = Math.sqrt(dist);
        return dist;
    }

    // distance from this point to (0,0)
    public double distanceFromOrigin() {
        return this.distance(new Point(0,0));
    }

    // Manhattan distance from this point to the other
    public int manhattanDistance(Point other) {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }
    // a toString method
    public String toString() {
	return "(" + this.x + ", " + this.y + ")";
    }
}
