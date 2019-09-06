package H04;

import java.awt.*;
        import java.applet.*;

public class Opdracht43 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(20, 70, 20, 250);
        g.setColor(Color.red);
        g.fillRect(20, 70, 100, 25);
        g.setColor(Color.white);
        g.fillRect(20, 90, 100, 25);
        g.setColor(Color.blue);
        g.fillRect(20, 110, 100, 22);
    }
}