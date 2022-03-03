import fang.core.Game;

/**
 *Catnip is a game that uses FANG.  Three sprites exist: a catsitter
 *(left edge of screen), a cat (right edge of screen), and a bag of
 *cat food.  The goal is to throw a bag of catnip to the cat.  Launch
 *the catnip using the space key.
 *
 * Created: date
 *
 * @author <a href="mailto:uuuu@potsdam.edu">Lab Partner #1</a>
 * @author <a href="mailto:vvvv@potsdam.edu">Lab Partner #2</a>
 * @version 1.0
 */
public class Catnip extends Game {

    private double catSpeed;
    private double catSitterSpeed;
    private double catnipSpeed;

    public void setup (){
	cat = new RectangleSprite(0.10, 0.10);  //makes cat sprite
	cat.setLocation(0.9, 0.5);              //places cat on middle right
	cat.setColor(getColor("white"));        //sets color of cat

	catSpeed = 0.5;

	catSitter = new RectangleSprite(0.10, 0.10);  //makes catSitter sprite
	catSitter.setLocation(0.1, 0.5);              //places catSitter on middle left
	catSitter.setColor(getColor("green"));        //sets color of catSitter
	catSitterSpeed = 0.6;

	catnip = new OvalSprite(0.05, 0.05);  //makes catnip sprite
	catnip.setVisible(false);             //sets catnip initially invisible
	catnipSpeed = 1.0;

	addSprite(cat);
	addSprite(catSitter);
        addSprite(catnip);

    }

    public void advance(double dT){
	cat.translateY(catSpeed * dT); // move the cat
	if ((cat.getY() >= 1.0) || (cat.getY() <= 0.0))
	    catSpeed = -catSpeed; //reverse cat if at bottom or top
    
	catSitter.translateY(catSitterSpeed * dT); // move the cat sitter
	if ((catSitter.getY() >= 1.0) || (catSitter.getY() <= 0.0))
	    catSitterSpeed = -catSitterSpeed; //reverse catSitter

	if (catnip.isVisible()){
	    // catnip is visible on screen
	    catnip.translateX(catnipSpeed * dT); // move the catnip
	    if (catnip.getX() >= 1.0) {
		// off the screen -- MISS
		catnip.setVisible(false);
	    } else if (catnip.intersects(cat)) {
		catnip.setVisible(false); // catnip is eaten -- HIT
		// score = score + 1;
		updateScore();
	    }
	} else if (getKeyPressed() == ' '){
	    // no catnip on screen -- create a new one
	    catnip.setLocation(catSitter.getLocation());
	    catnip.setVisible(true);  //launches catnip
	}
    }

    public void updateScore() {
	// System.out.println("score = " + score);
    }
}
