import fang.core.Game;
import fang.attributes.Location2D;
import fang.sprites.RectangleSprite;
import fang.sprites.StringSprite;

public class EasyDice extends Game {
    
    /** large, playing die */
    private OneDie die1;
    private OneDie die2;
    
    /** are we waiting to display the value of the die? */
    private boolean displayValue;
    
    /**
     * Set up the the die for a roll.
     */
    public void setup() {
	displayValue = false;
	
	die1 = new OneDie(this);
	die1.scale(0.33);
	die1.setLocation(0.25, 0.5);

	die2 = new OneDie(this);
	die2.scale(0.33);
	die2.setLocation(0.75, 0.5);

	addSprite(die1);
	addSprite(die2);
	
    } // setup

    
    // Advance the game one frame.
    // Depending on the state of the game,
    // check for button press, wait for 
    // wait for die to stop spinning, or report results.
    public void advance(double dT) {
    /**
     * The game is in one of two states: 
     *   - Rolling the die 
     *   - Finished rolling the die
     */
	updateDie(die1, dT, leftPressed());
	updateDie(die2, dT, rightPressed());

      }

      private void updateDie(OneDie die, double dT, boolean roll) {
	    if (!die.isRolling()) {
		if (roll)
		    die.roll(2.0);
	    } else
		die.advance(dT);
      }
}
