package H04;

import java.awt.*;
import java.applet.*;

public class Opdracht42 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 100, 100, 100);
        g.drawLine(50, 100, 75, 50);
        g.drawLine(75, 50, 100, 100);
        g.drawLine(100, 150, 100, 100);
        g.drawLine(50, 150, 50, 100);
        g.drawLine(50, 150, 100, 150);
        g.drawLine(55, 125, 65, 125);
        g.drawLine(55, 115, 65, 115);
        g.drawLine(65, 115, 65, 125);
        g.drawLine(55, 115, 55, 125);
        g.drawLine(75, 150, 75, 130);
        g.drawLine(85, 150, 85, 130);
        g.drawLine(75, 130, 85, 130);
    }
}