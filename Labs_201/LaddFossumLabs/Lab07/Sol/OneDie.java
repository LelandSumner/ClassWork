import fang.core.Game;
import fang.sprites.CompositeSprite;
import fang.sprites.OvalSprite;
import fang.sprites.RectangleSprite;
import java.util.ArrayList;

public class OneDie extends CompositeSprite {
private RectangleSprite background;

private Game game;

private ArrayList<OvalSprite> pips;

private double rollTime;

private double rollTimeThisFace;
private final double rollTimeThisFaceInit = 0.1;

private int value;

public OneDie(Game theGame) {
game = theGame;
initializeFaces();
setValue(game.randomInt(1, 6));
}

public void advance(double dT) {
if (rollTime > 0) {
      rollTime -= dT;
      if (rollTime <= 0)
	background.setColor(game.getColor("white"));
      if (rollTimeThisFace > 0) {
        rollTimeThisFace -= dT;
      } else {
        newFace();
        rollTimeThisFace = rollTimeThisFaceInit;
      }
    }
  }

  public int getValue() {
    return value;
  }

  public boolean isRolling() {
    return rollTime > 0;
  }

  public void roll(double time) {
    background.setColor(game.getColor("red"));
    rollTime = time;
    newFace();
    rollTimeThisFace = rollTimeThisFaceInit;
  }

  public void setValue(int v) {
    if ((1 <= v) && (v <= 6)) {
      value = v;
      for (int i = 0; i != pips.size(); ++i) {
        pips.get(i).setVisible(false);
      }
      if (value == 1) {
        pips.get(3).setVisible(true);
      } else if (value == 2) {
        pips.get(0).setVisible(true);
        pips.get(6).setVisible(true);
      } else if (value == 3) {
        pips.get(0).setVisible(true);
        pips.get(3).setVisible(true);
        pips.get(6).setVisible(true);
      } else {
        pips.get(0).setVisible(true);
        pips.get(2).setVisible(true);
        pips.get(4).setVisible(true);
        pips.get(6).setVisible(true);
        if (value == 5) {
          pips.get(3).setVisible(true);
        } else if (value == 6) {
          pips.get(1).setVisible(true);
          pips.get(5).setVisible(true);
        }
      }

    }
  }

  private void initializeFaces() {
    pips = new ArrayList<OvalSprite>();

    background = new RectangleSprite(1, 1);
    background.setColor(game.getColor("white"));
    addSprite(background);

    OvalSprite pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(-0.3, -0.3);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);

    pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(-0.3, 0.0);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);

    pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(-0.3, 0.3);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);

    pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(0.0, 0.0);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);

    pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(0.3, -0.3);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);

    pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(0.3, 0.0);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);

    pip = new OvalSprite(0.2, 0.2);
    pip.setLocation(0.3, 0.3);
    pip.setColor(game.getColor("black"));
    addSprite(pip);
    pips.add(pip);
  }

  private void newFace() {
    int newValue = value;
    while (newValue == value) {
      newValue = game.randomInt(1, 6);
    }
    setValue(newValue);
  }
}
