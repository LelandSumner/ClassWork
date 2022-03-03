// package default

import java.awt.Color;

import fang2.attributes.Location2D;
import fang2.core.Game;
import fang2.sprites.CompositeSprite;
import fang2.sprites.RectangleSprite;
import fang2.sprites.StringSprite;

/** A button class. Twice as wide as high with centered text message. */
public class EasyButton
  extends CompositeSprite {
  /** the button at the bottom of the screen */
  private final RectangleSprite button;

  /** text displayed, centered, on the button */
  private final StringSprite buttonMessage;

  /**
   * Construct new button. Horizontal, FANGBlue with same color text.
   */
  public EasyButton() {
    button = new RectangleSprite(1.0, 0.5);
    addSprite(button);
    buttonMessage = new StringSprite();
    addSprite(buttonMessage);
  }

  /**
   * Check if the button has been pressed.
   *
   * @return  true if mouse clicked within the button, false otherwise.
   */
  public boolean isPressed() {
    // The current game may have a mouse click or not.
    Location2D mouseClick =
      Game.getCurrentGame().getClick2D();
    if (mouseClick != null) {
      if (intersects(mouseClick)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Set the color of the background rectangle
   *
   * @param  color  the color to set the rectangle to.
   */
  @Override
  public void setColor(Color color) {
    button.setColor(color);
  }

  /**
   * Set text message; resize to fit in one line
   *
   * @param  message  the new message for the button to display
   */
  public void setText(String message) {
    buttonMessage.setText(message);
    // adjust size of text message to fit on the button
    buttonMessage.setWidth(0.75);
  }

  /**
   * Set the color of the text on the button.
   *
   * @param  color  the color to set the text to
   */
  public void setTextColor(Color color) {
    buttonMessage.setColor(color);
  }
}
