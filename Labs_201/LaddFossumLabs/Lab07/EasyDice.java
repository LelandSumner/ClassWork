import fang.core.Game;
import fang.attributes.Location2D;
import fang.sprites.RectangleSprite;
import fang.sprites.StringSprite;

public class EasyDice extends Game {
    
    /** large, playing die */
    private OneDie die;
    
    /** are we waiting to display the value of the die? */
    private boolean displayValue;
    
    /**
     * Set up the the die for a roll.
     */
    public void setup() {
	displayValue = false;
	
	die = new OneDie(this);
	die.scale(0.33);
	die.setLocation(0.5, 0.5);

	addSprite(die);
	
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
	    if (!die.isRolling()) {
		if (displayValue) {
		    System.out.println("roll " + die.getValue());
		    displayValue = false;
		}
		if (upPressed()) {
		    die.roll(2.0);
		    displayValue = true;
		}
	    } else
		die.advance(dT);
      }
}
