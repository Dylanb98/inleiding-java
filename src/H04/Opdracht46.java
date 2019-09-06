package H04;

import java.awt.*;
import java.applet.*;

public class Opdracht46 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.fillRect(42, 125, 15, 100);
        g.fillRect(20, 20, 60, 120);
        g.setColor(Color.red);
        g.fillOval(38, 30, 20, 20);
        g.setColor(Color.orange);
        g.fillOval(38, 70, 20, 20);
        g.setColor(Color.green);
        g.fillOval(38, 110, 20, 20);
    }

    }