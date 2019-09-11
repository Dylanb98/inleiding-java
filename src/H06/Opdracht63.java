package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht63 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 2147483647;
        b = 20;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("2147483647 + 20  = " + uitkomst, 20, 20);
    }
}
