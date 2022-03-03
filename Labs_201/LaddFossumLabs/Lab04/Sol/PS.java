import fang.core.Game;
import fang.sprites.*;

public class PS extends Game {

	public void setup() {
		PieSprite ps = new PieSprite(0.35, 0.35, 175.0, 185.0);
		ps.setLocation(0.1, 0.9);
		addSprite(ps);
	}
}
