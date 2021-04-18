package cn.itcast.day11.demo07;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);

        Color startColor = new Color(red, green, blue);

        red = (int)(Math.random() * 255);
        green = (int)(Math.random() * 255);
        blue = (int)(Math.random() * 255);

        Color endColor = new Color(red, green, blue);


        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
