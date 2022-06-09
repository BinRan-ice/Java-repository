package cn.itcast.day09.demo04;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Font;

public class stopWatch extends JPanel{
    private JLabel currentTimeLabel; //显示标签 
    private JButton startJButton;    //开始按钮
    private JButton stopJButton;     //停止按钮
    private JButton resetJButton;    //复位按钮
    private JButton burstJButton;    //分段按钮
    private long countMis,countSec,countMin,countHour;//计时变量
    private DecimalFormat textFormat=new DecimalFormat("00");//格式化输出
    Timer timer=new Timer(10,new TestActionListener());//计时单位10ms

    public stopWatch() {
        JPanel panel=new JPanel(new GridLayout(1,3,5,10)); //网格布局嵌入按钮
        JPanel panel2=new JPanel();
        currentTimeLabel=new JLabel(" ");
        TestActionListener actionListener=new TestActionListener();
        currentTimeLabel.setForeground(Color.blue);
        currentTimeLabel.setFont(new Font("SAN_SERIF",Font.BOLD,50));

        startJButton=new JButton("1:start");
        stopJButton=new JButton("2:end");
        resetJButton=new JButton("3:reset");
        burstJButton=new JButton("4:burst");
        //设置JButton相关属性
        startJButton.setBorder(BorderFactory.createRaisedBevelBorder());
        stopJButton.setBorder(BorderFactory.createRaisedBevelBorder());
        resetJButton.setBorder(BorderFactory.createRaisedBevelBorder());
        burstJButton.setBorder(BorderFactory.createRaisedBevelBorder());

        startJButton.setFont(new java.awt.Font("Times New Roman", 1, 30));
        stopJButton.setFont(new java.awt.Font("Times New Roman", 1, 30));
        resetJButton.setFont(new java.awt.Font("Times New Roman", 1, 30));
        burstJButton.setFont(new java.awt.Font("Times New Roman", 1, 30));

        stopJButton.setBackground(Color.cyan);
        startJButton.setBackground(Color.red);
        resetJButton.setBackground(Color.orange);
        burstJButton.setBackground(Color.blue);

        stopJButton.addActionListener(actionListener);
        startJButton.addActionListener(actionListener);
        resetJButton.addActionListener(actionListener);
        burstJButton.addActionListener(actionListener);

        this.setLayout(new BorderLayout());

        panel2.setBackground(Color.gray);
        panel2.setBorder(BorderFactory.createLoweredBevelBorder());
        panel2.add(currentTimeLabel);
        panel.add(stopJButton);
        panel.add(startJButton);
        panel.add(resetJButton);
        panel.add(burstJButton);

        this.add(panel2,BorderLayout.NORTH);
        this.add(panel,BorderLayout.CENTER);

    }
    //处理相关事件
    class TestActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==startJButton){
                timer.start();
                startJButton.setEnabled(false);
            }

            else if(e.getSource()==stopJButton){
                timer.stop();
                startJButton.setEnabled(true);
            }

            else if(e.getSource()==resetJButton){
                countHour=0;
                countMin=0;
                countSec=0;
                countMis=0;
            }
            else{//满位后复位
                countMis++;
                if(countMis>=99){
                    countSec++;
                    countMis=0;
                    if(countSec>=59){
                        countMin++;
                        countSec=0;
                        if(countMin>=59){
                            countHour++;
                            countMin=0;
                        }
                    }
                }

            }

        }
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        currentTimeLabel.setText(textFormat.format(countHour)+":"+textFormat.format(countMin)+
                ":"+textFormat.format(countSec)+":"+textFormat.format(countMis));
        repaint();
    }


    public static void main(String args[]){
        JFrame frame=new JFrame("秒表演示");
        stopWatch stopwatch=new stopWatch();
        frame.setSize(480,280);
        frame.getContentPane().add(stopwatch);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}  