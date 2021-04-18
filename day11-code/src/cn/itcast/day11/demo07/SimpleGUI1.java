package cn.itcast.day11.demo07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleGUI1 {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        new SimpleGUI1().go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("改变标签");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("改变颜色");
        colorButton.addActionListener(new ColorListener());

        MyDrawPanel draw = new MyDrawPanel();
        label = new JLabel("我是一个标签");
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, draw);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            label.setText("哎呦!");
        }
    }

    class ColorListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }
}

