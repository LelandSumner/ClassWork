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
    

    // Checkpoint 1

    // Checkpoint 5


    // Checkpoint 2 and 3


    // Checkpoint 4


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
