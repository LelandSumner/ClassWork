import fang.core.Game;
import fang.sprites.OvalSprite;

/**
 * Orbits.java - Solution to Lab3 CIS 201, Fall 2008
 *
 * This program simulates a simplified three-body "solar
 * system". There is a sun, a planet, and, around that planet, a
 * moon. The simplification is that all orbits are perfect
 * circles. This lab is designed to help students understand methods
 * and expressions.
 *
 * Created: Mon Sep  8 15:39:13 2008
 *
 * @author <a href="mailto:blad@BigRedOne">Brian C. Ladd</a>
 * @version 1.0
 */
public class Orbits extends Game {
    /**
     * The sun, at the center of the "universe"; will be red.
     */
    private OvalSprite sun;
    
    /** 
     * x-coordinate of the earth's center
     */
    private double ex;
    /**
     * y-coordinate of the earth's center
     */
    private double ey;

    /**
     * how far has the earth advanced along its orbit (in radians)
     */
    private double eTheta;
    
    /**
     * cosine of eTheta
     */
    private double eCosTheta;

    /**
     * sine of eTheta
     */
    private double eSinTheta;

    /**
     * The radius of the earth's radius
     */
    private double eRadius;

    /**
     * the earth
     */
    private OvalSprite earth;
						
    private double mx;
    private double my;
    private double mTheta;
    private double mCosTheta;
    private double mSinTheta;
    private double mRadius;

    private OvalSprite moon;
    
    

    /**
     * Create all the sprites and inialize all of the variables.
     *
     */
    public final void setup() {
	// the sun
	sun = new OvalSprite(0.10, 0.10);
	sun.setColor(getColor("red"));
	sun.setLocation(0.50, 0.50);
	
	// the earth
	ex = 1.00;
	ey = 0.00;
	eTheta = 0.005;
	eCosTheta = Math.cos(eTheta);
	eSinTheta = Math.sin(eTheta);
	eRadius = 0.45;

	earth = new OvalSprite(0.03, 0.03);
	earth.setColor(getColor("green"));
	locateEarth();

	mx = 0.00;
	my = 1.00;
	mTheta = 12 * eTheta;
	mCosTheta = Math.cos(mTheta);
	mSinTheta = Math.sin(mTheta);
	mRadius = 0.05;

	moon = new OvalSprite(0.01, 0.01);
	moon.setColor(getColor("white"));
	locateMoon();

	addSprite(sun);
	addSprite(earth);
	addSprite(moon);
    }

    /**
     * Describe <code>advance</code> method here.
     *
     * @param dT deltaTime = time since last call to advance
     */
    public final void advance(final double dT) {
	double exx = ex * eCosTheta - ey * eSinTheta;
	double eyy = ey * eCosTheta + ex * eSinTheta;
	ex = exx;
	ey = eyy;
	locateEarth();
	
	double mxx = mx * mCosTheta - my * mSinTheta;
	double myy = my * mCosTheta + mx * mSinTheta;
	mx = mxx;
	my = myy;
	locateMoon();

    }
    
    /**
     * Assuming ex and ey are properly set, this will locate the planet earth 
     * at the appropriate point on its orbit.
     */
    private void locateEarth() {
	earth.setLocation(sun.getX() + ex * eRadius, sun.getY() + ey * eRadius);	
    }

    /**
     * Assuming ex and ey are properly set, this will locate the planet earth 
     * at the appropriate point on its orbit.
     */
    private void locateMoon() {
	moon.setLocation(earth.getX() + mx * mRadius, earth.getY() + my * mRadius);
    }
}
