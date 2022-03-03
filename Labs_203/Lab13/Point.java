public class Point {

    // class data field

    // object data fields
    int x;
    int y;

    public Point (int initX, int initY) {
	this.x = initX;
        this.y = initY;
        
    }

    // here write manhattanDistance(Point other) 
    

    //Checkpoint 1
    public Point() {
        x = 0;
        y = 0;
    }

    // Checkpoint 5


    // Checkpoint 2 and 3
    public double getSlope(Point p) {
        if (x == p.x) {
            throw new IllegalArgumentException();
        }
        return ( (double)p.y - y)/( (double)p.x - x );
    }


    // Checkpoint 4
    public boolean isColinear(Point p1, Point p2) {
        return getSlope(p1) == getSlope(p2);
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

    // a toString method
    public String toString() {
	return "(" + this.x + ", " + this.y + ")";
    }
}
