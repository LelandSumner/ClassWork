import java.awt.Color;

public class Pic1 {
    
    public static void main(String [] args) {
	Picture p = new Picture(/* FIXME */ );
	Pixel [] pixels = p.getPixels();
	System.out.println("This picture has " + pixels.length + " pixels");
	for (int i=0 ; i<pixels.length ; i++) {
	    Pixel pix = pixels[i];
	    int r = pix.getRed();
	    int g = pix.getGreen();
	    int b = pix.getBlue();
	    pixels[i].setColor(new Color(r, g, b));
	}
	p.show();
    }
}
