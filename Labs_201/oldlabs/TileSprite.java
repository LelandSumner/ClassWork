import fang.core.Game;
import fang.sprites.*;
import java.awt.Color;

public class TileSprite extends CompositeSprite {

    private int val;
    private Game game;
    private RectangleSprite outer;
    private RectangleSprite inner;
    private StringSprite valDisplay;
    private final Color BLACK;
    private final Color WHITE;
    private final Color RED;
    private final Color BLUE;

    public TileSprite (Game game) {
	this.game = game;
	BLACK = game.getColor("black");
	WHITE = game.getColor("white");
	RED = game.getColor("red");
	BLUE = game.getColor("blue");

	val = 1;

	outer = new RectangleSprite(1.0, 1.0);
	outer.setLocation(0.0, 0.0);
	outer.setColor(BLACK);
	addSprite(outer);

	inner = new RectangleSprite(0.9, 0.9);
	inner.setLocation(0.0, 0.0);
	inner.setColor(WHITE);
	addSprite(inner);
	inner.hide();

	valDisplay = new StringSprite();
	valDisplay.setScale(0.6);
	valDisplay.setText("" + val);
	valDisplay.setLocation(0.0, 0.0);
	valDisplay.setColor(BLUE);
	addSprite(valDisplay);
	valDisplay.hide();
    }

    public int getValue() {
	return val;
    }

    public void setValue(int v) {
	val = v;
	if (v == 16) {
	    outer.setColor(BLACK);
	    inner.hide();
	    valDisplay.hide();
	} else {
	    inner.show();
	    valDisplay.setText(""+val);
	    valDisplay.show();
	}
    }

    public void setSelected(boolean select) {
	if (val < 16) {
	    if (select) {
		outer.setColor(RED);
	    } else {
		outer.setColor(BLACK);
	    }
	}
    }
}
