package labofdatastructure;

import java.applet.Applet;
import java.awt.Graphics;

public class Triangle extends Applet {
    
    int[] x = {20, 50, 80};
    int[] y = {80, 20, 80};
    
    public void paint(Graphics g) {
        g.drawPolygon(x, y, 3);
    }
    
    //Note -> When running this program there is some error will appear 
    //but don't care it's working
    
}
