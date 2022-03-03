import java.awt.geom.Rectangle2D;

import fang2.sprites.OvalSprite;
import fang2.sprites.RectangleSprite;
import fang2.attributes.Box2D;
import fang2.attributes.Location2D;
import fang2.core.Sprite;

public class Pinball 
  extends OvalSprite {

  private Location2D velocity;
  
  /**
   * Construct a new bouncing ball. This cannonical constructor uses the provided dimentions (in screens) and velocity 
   * (in screens/second) to construct a bouncing ball. 
   *  
   * @param width - width, in screens of the bouncing ball.
   * @param height - height, in screens, of the bouncing ball
   * @param dX - horizontal change, in screens/second of the moving ball
   * @param dY - vertical change, in screens/second, of the moving ball
   */
  public Pinball(double width, double height, double dX, double dY) {
    super(width, height);
    velocity = new Location2D(dX, dY);
  }
  
  /**
   * Construct a new, immobile, bouncing ball.
   * @param width - width, in screens, of the bouncing ball
   * @param height - height, in screens, of the bouncing ball
   */
  public Pinball(double width, double height) {
    this(width, height, 0.0, 0.);
  }
  
  /**
   * Get a copy of the current velocity.
   * @return copy of current velocity
   */
  public Location2D getVelocity() {
    return new Location2D(velocity);
  }
  
  /**
   * Set the velocity to the given value
   * @param delta The new velocity
   */
  public void setVelocity(Location2D delta) {
    setVelocity(delta.getX(), delta.getY());
  }
  
  /**
   * Set the velocity to the given value
   * @param dX - horizontal component (in screens/sec) of the velocity
   * @param dY - vertical component (in screens/sec) of the velocity
   */
  public void setVelocity(double dX, double dY) {
    velocity = new Location2D(dX, dY);
  }
  
  /**
   * Advance this bouncing ball. That is, move it one frame's worth of distance.
   * 
   * @param dT - time, in seconds, since the last call to advance
   */
  public void advance(double dT) {
    this.translate(velocity.getX() * dT, velocity.getY() * dT);
  }
  
  /**
   * Bounce off of the edges of a rectangular region on the screen.  The four parameters
   * are the boundaries of the region.
   * 
   * @param minX left-edge x parameter
   * @param minY top-edge y parameter
   * @param maxX right-edge x parameter
   * @param maxY bottom-edge y parameter
   */
  public void bounceEdges(double minX, double minY, double maxX, double maxY) {
    if ((this.getMinX() < minX) || (maxX < this.getMaxX())) {
      setVelocity(-velocity.getX(), velocity.getY());
    }
    if ((this.getMinY() < minY) || (maxY < this.getMaxY())) {
      setVelocity(velocity.getX(), -velocity.getY());
    }
  }
   
  /**
   * If this sprite has hit another sprite, this routine will bounce the pinball off of it; note that
   * different determination of bouncing is used for different types of objects: round objects bounce the
   * pinball across the normal of the point of impact and rectangle objects do the same but really only 
   * reverse x or y component. 
   * 
   * @param other the object offwhich to bounce
   */
  public void bounceOffOf(Sprite other) {
    if (other instanceof OvalSprite) {
      // both are round; normal is on line connecting centers.
      Location2D centerVector = new Location2D(other.getX() - getX(), other.getY() - getY());
      Location2D normalVector = centerVector.normalize();
      
      // Break velocity into normal and tangent components
      Location2D normalVelocity = Location2D.componentVector(velocity, normalVector);
      Location2D tangentVelocity = velocity.subtract(normalVelocity);
    
      // reflect (invert) the normal component and add to unchanged tangent component.
      setVelocity(tangentVelocity.subtract(normalVelocity));
    } else if (other instanceof RectangleSprite) {
      Box2D otherBounds = other.getBounds2D();
      int out = otherBounds.outcode(getX(), getY());
      if ((out & (Rectangle2D.OUT_BOTTOM | Rectangle2D.OUT_TOP)) != 0) {
        setVelocity(velocity.getX(), -velocity.getY());      }
      if ((out & (Rectangle2D.OUT_LEFT | Rectangle2D.OUT_RIGHT)) != 0) {
        setVelocity(-velocity.getX(), velocity.getY());      
      }
    } 
    // otherwise ignore the other sprite
  }
  
}
