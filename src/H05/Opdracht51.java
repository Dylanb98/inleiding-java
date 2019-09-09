package H05;

import java.awt.*;
import java.applet.*;

public class Opdracht51 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 180;
        hoogte =  80;

    }
    public void paint(Graphics g) {
        g.drawLine(50, 60, 230,60);
        g.drawString("Lijn", 130, 74);
        g.drawRect(50, 80, breedte, hoogte);
        g.drawString("Rechthoek", 112, 175);
        g.drawRoundRect(50, 190, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde Rechthoek", 81, 285);
        g.setColor(opvulkleur);
        g.fillRect(240, 80, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 250, 175);
        g.drawOval(240, 80, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(240, 190, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 290, 285);
        g.drawOval(430, 80, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(425, 80, 185, 85, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 439, 175);
        g.drawOval(480, 190, hoogte, hoogte);
        g.drawString("Cirkel", 505, 285);
    }
}
