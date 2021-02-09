//Name : محمود قناوي محمود أبو عمر.
//Section : 12
package labofdatastructure;

import java.applet.Applet;
import java.awt.Graphics;

public class Circle extends Applet {

    public void paint(Graphics x) {
        x.drawOval(30, 30, 90, 90);
        x.setColor(java.awt.Color.BLACK);
        x.fillOval(30, 30, 90, 90);
    }

}
