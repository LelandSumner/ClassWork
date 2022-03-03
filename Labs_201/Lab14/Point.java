public class Point {

    // ================================================================
    // CLASS fields
    // ================================================================
    
    static int numPoints = 0;
    
    // ================================================================
    // CLASS methods
    // ================================================================
    
    
    
    // ================================================================
    // CONSTRUCTORS
    // ================================================================

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
        numPoints++;
    }

    // ================================================================
    // INSTANCE fields
    // ================================================================

    int x;
    int y;

    // ================================================================
    // INSTANCE methods
    // ================================================================

    // Move a point by the given x and y deltas
    public void translate (int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void setLocation(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // distance from this point to another
    public double distance(Point other) {
        double dist_squared = 
                (this.x - other.x)*(this.x - other.x) + 
                (this.y - other.y)*(this.y - other.y);
        return Math.sqrt(dist_squared);
    }

    // distance from this point to (0,0)
    public double distanceFromOrigin() {
        return this.distance(new Point(0,0));
    }

    // a toString method
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    // a private utility method to compare doubles
    private boolean withinAMillionth(double u, double v) {
        return (Math.abs(u - v) < 10e-6);
    }
    
} // end class
