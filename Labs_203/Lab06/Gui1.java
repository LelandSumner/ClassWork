import java.awt.*;

public class Gui1 {
    public static void main (String [] args) {
        DrawingPanel panel = new DrawingPanel(200,100);

        Graphics g = panel.getGraphics();
        g.drawRect(25, 50, 20, 20);
        g.drawRect(150, 10, 40, 20);
        g.drawOval(50, 25, 20, 20);
        g.drawOval(150, 50, 40, 20);
    }
}
