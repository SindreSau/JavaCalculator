package com.calculator;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class CalcWindow extends Calc{
    public void calcWindow() {
        //Frame
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 600);
        f.setResizable(false);
        f.setLocationRelativeTo(null);  //places window center of screen

        //Output panel
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, f.getWidth(), 220);
        p1.setBackground(gray);



        //Button panel
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5, 4, 2, 2));   //Values: columns, rows, hor-gap, vert-gap
        p2.setBounds(0, 220, f.getWidth(), f.getHeight()-248);
        p2.setBorder(BorderFactory.createLineBorder(darkGray, 10));
        p2.setBackground(darkGray);

        //Create buttons
        byte btnCount = 20 + 1;
        JButton[] btn = new JButton[btnCount];
        for (int b=1; b < btnCount; b++){
            btn[b] = new JButton();
        }

        //Add outputField
        t.setEditable(false);
        t.setBounds(50,50,150,20);
        t.setSize(100, 20);
        p1.add(t);

        btn[1].setText("C");btn[2].setText("( )");btn[3].setText("%");btn[4].setText("/");
        btn[5].setText("7");btn[6].setText("8");btn[7].setText("9");btn[8].setText("x");
        btn[9].setText("4");btn[10].setText("5");btn[11].setText("6");btn[12].setText("-");
        btn[13].setText("1");btn[14].setText("2");btn[15].setText("3");btn[16].setText("+");
        btn[17].setText("(+/-)");btn[18].setText("0");btn[19].setText(",");btn[20].setText("=");

        btn[1].addActionListener(e -> erase());
        btn[5].addActionListener(e -> seven());btn[6].addActionListener(e -> eight());btn[7].addActionListener(e -> nine());
        btn[9].addActionListener(e -> four());btn[10].addActionListener(e -> five());btn[11].addActionListener(e -> six());btn[12].addActionListener(e -> subtract());
        btn[13].addActionListener(e -> one());btn[14].addActionListener(e -> two());btn[15].addActionListener(e -> three());
        btn[17].addActionListener(e -> negative());btn[18].addActionListener(e -> zero());

        btn[16].addActionListener(e -> add());
        btn[20].addActionListener(e -> equals());

        btn[1].setForeground(RED);
        Color darkGreen = new Color(0, 120, 0);
        btn[20].setForeground(darkGreen);btn[20].setFont(new Font("Arial", Font.PLAIN, 30));
        /*btn[20].setOpaque(false);btn[20].setBackground(green);*/


        for (int b=1; b < btnCount; b++){
            p2.add(btn[b]);
        }



        f.add(p2);
        f.add(p1);
        f.setVisible(true);
    }
}
