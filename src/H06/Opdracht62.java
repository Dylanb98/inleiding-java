package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht62 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int uitkomst;
    int getUitkomst2;
    int getUitkomst3;

    public void init() {
        a = 60;
        b = 60;
        c = 3600;
        d = 24;
        e = 86400;
        f = 365;
        uitkomst = a * b;
        getUitkomst2 = c * d;
        getUitkomst3 = e * f;

    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een minuut  =  60" , 20, 20);
        g.drawString("Aantal seconden in een uur  =  Aantal seconden in een minuut *60  =  " + uitkomst, 20, 40);
        g.drawString("Aantal seconden in een dag  =  Aantal seconden in een uur *24  =  " + getUitkomst2, 20, 60);
        g.drawString("Aantal seconden in een jaar  =  Aantal seconden in een dag *365  =  " + getUitkomst3, 20, 80);
    }
}