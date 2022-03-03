import fang.core.Game;
import fang.sprites.StringSprite;

public class MyNameGame extends Game {

  private MyName mn; // refers to a MyName object
  private StringSprite mnSprite;

  public void setup() {
    mn = new MyName();
    mnSprite = new StringSprite();
    mnSprite.scale(0.05);
    mnSprite.leftJustify();
    mnSprite.setLocation(0.0, 0.5);
    mnSprite.setColor(getColor("white"));
    mnSprite.setText(mn.getName());
    
    addSprite(mnSprite);
  }
}
