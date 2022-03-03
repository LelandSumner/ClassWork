import java.awt.Color;

public class Pic2 {
    
    public static void main(String [] args) {
	Picture p = new Picture(args[0]);
	int w = p.getWidth();
	int w2 = w/2;
	int h = p.getHeight();
	for (int x=0 ; x<w2 ; x++) {
	    for (int y=0 ; y<h ; y++) {
		Pixel px = p.getPixel(x, y);
		int r = px.getRed();
		int g = px.getGreen();
		int b = px.getBlue();
		px.setColor(new Color(0, g, b));
            }
	}
	p.show();
    }
}
