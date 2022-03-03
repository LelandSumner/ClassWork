// package default

import fang2.core.Game;
import fang2.sprites.StringSprite;

/**
 * Simplified craps game: Player wagers 1 matchstick per round. 7/11 on
 * roll out wins; else roll out sets point. Subsequent rolls in round
 * lose on 7, win on point, push on other. There are four dice on
 * screen: the rolling pair and a pair showing the point when it was set
 * during the first roll.
 */
public class EasyDice
  extends Game {
  /** bank balance; game ends when this goes to 0 after a bet */
  private int bank;// value
  private StringSprite bankDisplay;// display

  /** player's current bet */
  private int bet;// value
  private StringSprite betDisplay;// display

  /** the button */
  private EasyButton button;

  /** the left die */
  private OneDie dieLeft;

  /** the right die */
  private OneDie dieRight;

  /** the value the player is trying to match */
  private int point;

  /** the left point die */
  private OneDie pointDieLeft;

  /** the right point die */
  private OneDie pointDieRight;

  /** is there an active bet? */
  private boolean rolling;

  /**
   * Advance one frame: either waiting for player to bet or waiting for
   * player to roll. Determined by rolling flag.
   *
   * @param  dT  time since last advance; used for animation
   */
  @Override
  public void advance(double dT) {
    if (!isGameOver()) {
      if (!rolling) {
        advanceWaiting(dT);
      } else {
        advanceRolling(dT);
      }
    }
  }
  
  /**
   * Set up the game for play. Initializes all of the sprites (either
   * here or in other setup functions).
   */
  @Override
  public void setup() {
    setBackground(getColor("green"));
    rolling = false;
    buttonSetup();
    bankSetup();
    betSetup();
    diceSetup();
  }

  /**
   * Advance one rolling frame. If button pressed, roll dice and handle
   * non-first roll.
   *
   * @param  dT  time since last advance; used for animation
   */
  private void advanceRolling(double dT) {
    if (button.isPressed()) {
      int roll = rollTheDice();
      // game wins, loses, or keeps going. Nothing to do to keep going
      if (roll == 7) {// lose
        lose();
      } else if (roll == point) {// win
        win();
      }
    }
  }

  /**
   * Advance one waiting frame. If button pressed, make wager, roll
   * dice, handle first roll.
   *
   * @param  secondsSinceLastCall  time since last advance; used for
   *                               animation
   */
  private void advanceWaiting(double secondsSinceLastCall) {
    if (button.isPressed()) {
      // place and show wager
      bet = 1;
      bank = bank - bet;
      betDisplay.setText("Bet: " + bet);
      bankDisplay.setText("Bank: " + bank);

      int roll = rollTheDice();

      // check for a win on the first roll
      if ((roll == 7) || (roll == 11)) {
        win();
      } else {
        // copy roll dice up to the point
        pointDieLeft.setFace(dieLeft.getFace());
        pointDieRight.setFace(dieRight.getFace());

        // set new point, set rolling flag, and change button text
        point = roll;
        rolling = true;
        button.setText("Roll to match point");
      }
    }
  }

  /**
   * Initialize match pile and display sprite
   */
  private void bankSetup() {
    bank = 10;// initial value for the bank in matchsticks
    bankDisplay = new StringSprite();
    bankDisplay.setLineHeight(0.10);
    bankDisplay.leftJustify();
    bankDisplay.setLocation(0.0, 0.1);
    bankDisplay.setColor(getColor("white"));
    addSprite(bankDisplay);

    bankDisplay.setText("Matchsticks: " + bank);
  }

  /**
   * Initialize wager and display sprite.
   */
  private void betSetup() {
    bet = 0;
    betDisplay = new StringSprite();
    betDisplay.setLineHeight(0.05);
    betDisplay.rightJustify();
    betDisplay.setLocation(1.0, 0.2);
    betDisplay.setColor(getColor("white"));
    addSprite(betDisplay);

    betDisplay.setText("Bet: " + bet);
  }

  /**
   * Create the button (at the bottom center of the screen). The fields
   * button and message are initialized (and the text of message can
   * subsequently be changed to change the function of the button)
   */
  private void buttonSetup() {
    button = new EasyButton();
    button.setScale(0.5);
    button.setLocation(0.5, 0.85);
    button.setColor(getColor("red"));
    button.setTextColor(getColor("white"));
    addSprite(button);

    button.setText("Bet 1 matchstick");
  }

  /**
   * Create and position four dice, two large and two small.
   */
  private void diceSetup() {
    dieLeft = new OneDie();
    dieLeft.setScale(0.33);
    dieLeft.setLocation(5.0 / 18.0, 0.6);
    addSprite(dieLeft);

    dieRight = new OneDie();
    dieRight.setScale(0.33);
    dieRight.setLocation(13.0 / 18.0, 0.6);
    addSprite(dieRight);

    pointDieLeft = new OneDie();
    pointDieLeft.setScale(0.1);
    pointDieLeft.setLocation(0.75, 0.1);
    addSprite(pointDieLeft);

    pointDieRight = new OneDie();
    pointDieRight.setScale(0.1);
    pointDieRight.setLocation(0.9, 0.1);
    addSprite(pointDieRight);
  }

  /**
   * Post rolling clean-up. Here to avoid repeating in win() and lose()
   */
  private void finishRolling() {
    bet = 0;
    bankDisplay.setText("Bank: " + bank);
    betDisplay.setText("Bet: " + bet);

    rolling = false;
    button.setText("Bet 1 matchstick");
  }

  /**
   * Player lost wager; bank remains unchanged, finish rolling.
   */
  private void lose() {
    if (bank == 0) {
      // if out of matches, game is over
      setGameOver(true);
    }
    finishRolling();
  }

  /**
   * Roll the game dice. Return the sum of the pair of dice.
   *
   * @return  the sum of the newly rolled dice
   */
  private int rollTheDice() {
    dieRight.roll();
    dieLeft.roll();
    return dieLeft.getFace() + dieRight.getFace();
  }

  /**
   * Player won wager; return twice wager to bank finish rolling.
   */
  private void win() {
    bank = bank + (2 * bet);
    finishRolling();
  }
}
