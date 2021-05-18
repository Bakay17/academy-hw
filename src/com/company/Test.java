package com.company;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Test extends JComponent {
    private int width;
    private int height;

    public Test(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Test(){
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(50, 50, 50, 50);
        g2d.setColor(Color.ORANGE);
        g2d.fill(r);

        CubicCurve2D.Double c = new CubicCurve2D.Double(300, 500, 1000, 0, 0, 0, 0, 20);
        g2d.setColor(Color.BLUE);
        g2d.fill(c);
    }
}
