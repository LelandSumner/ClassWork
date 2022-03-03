import fang.sprites.*;

public class TicTacToeSquare 
    extends CompositeSprite {
    
    private TicTacToe theGame;
    private RectangleSprite background;
    private StringSprite displayContent;
    private String content;

    public TicTacToeSquare(TicTacToe someGame) {
	theGame = someGame;
	content = " ";
	background = new RectangleSprite(1.0, 1.0);
	background.setColor(theGame.getColor(25, 25, 25));
	addSprite(background);
	
	displayContent = new StringSprite(content);
	displayContent.setColor(theGame.getColor("red"));
	addSprite(displayContent);
    }

    public String getContent() {
	return content;
    }

    public void clear() {
	content = " ";
	background.setColor(theGame.getColor(25, 25, 25));
	displayContent.setText(content);
    }

    public void advance(double dT) {
	if (content.equals(" ")) {
	    if (theGame.mouseLeftPressed()) {
		if (intersects(theGame.getLeftClick2D())) {
		    content = theGame.getTurn();
		    displayContent.setText(content);
		    background.setColor(theGame.getColor("black"));
		    theGame.finishTurn();
		}
	    }
	}
    }
}