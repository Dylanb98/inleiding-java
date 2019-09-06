package H04;

import java.awt.*;
import java.applet.*;

public class PraktijkopdrachtH4 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(50, 60, 230,60);
        g.drawString("Lijn", 130, 74);
        g.drawRect(50, 80, 180, 80);
        g.drawString("Rechthoek", 112, 175);
        g.drawRoundRect(50, 190, 180, 80, 30, 30);
        g.drawString("Afgeronde Rechthoek", 81, 285);
        g.setColor(Color.MAGENTA);
        g.fillRect(240, 80, 180, 80);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 250, 175);
        g.drawOval(240, 80, 180, 80);
        g.setColor(Color.magenta);
        g.fillOval(240, 190, 180, 80);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 290, 285);
        g.drawOval(430, 80, 180, 80);
        g.setColor(Color.magenta);
        g.fillArc(425, 80, 185, 85, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 439, 175);
        g.drawOval(480, 190, 80, 80);
        g.drawString("Cirkel", 505, 285);
    }
}