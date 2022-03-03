import fang.core.Game;
import fang.sprites.*;
import java.util.*;

public class RakingLeaves extends Game {

    private double split = 0.33;
    private ArrayList<PolygonSprite> leaves;
    private PolygonSprite rake;
    private double rakeSpeed;

    public RakingLeaves() {
	super (640, 640);
    }

    public void setup() {
	RectangleSprite leafPile = new RectangleSprite(split, 1.0);
	leafPile.setLocation(split/2, 0.5);
	leafPile.setColor(getColor("green"));
	addSprite(leafPile);

	leaves = new ArrayList<PolygonSprite>();

	for (int i=0 ; i<10 ; i++) {
	    leaves.add(makeLeaf());
	}

	rake = new PolygonSprite(3);
	rake.setColor(getColor("yellow"));
	rake.setScale(0.10);
	rake.setLocation(0.5, 0.5);
	rakeSpeed = 1.0;
	addSprite(rake);
    }

    public void advance(double dT) {
	double move = dT * rakeSpeed;
	if (rightPressed() && rake.getX() < 1.0)
	    rake.translateX(move);
	else if (leftPressed() && rake.getX() > split)
	    rake.translateX(-move);
	else if (downPressed() && rake.getY() < 1.0)
	    rake.translateY(move);
	else if (upPressed() && rake.getY() > 0.0)
	    rake.translateY(-move);
	
	for (int i=0 ; i<leaves.size() ; i++) {
	    PolygonSprite leaf = leaves.get(i);
	    if (rake.intersects(leaf)) {
		leaf.setLocation(randomDouble(0.0, split), randomDouble(0.5,1.0));
		leaves.set(i, makeLeaf());
	    }
	}
    }

    public PolygonSprite makeLeaf() {
	PolygonSprite leaf = new PolygonSprite(randomInt(3,6));
	leaf.setColor(getColor(randomInt(128,255), randomInt(128,255), randomInt(128,255)));
	leaf.setLocation(randomDouble(split, 1.0), randomDouble());
	leaf.setScale(0.05);
	addSprite(leaf);
	return leaf;
    }

}
