package com.calculator;

import javax.swing.*;

public class Calc{
    JTextArea t = new JTextArea();

    int totalClicks;
    void erase() {
        /*System.out.println("Erase"+totalClicks);*/
        int eraseNum=0;
        while (eraseNum < totalClicks) {
            eraseNum += 1;
            t.setText("");
        }
    }
    void negative() {
        t.setText(t.getText() + "-");
        totalClicks += 1;
    }
    void zero() {
        t.setText(t.getText() + "0");
        totalClicks += 1;
    }
    void one(){
        t.setText(t.getText() + "1");
        totalClicks += 1;
    }
    void two() {
        t.setText(t.getText() + "2");
        totalClicks += 1;
    }
    void three() {
        t.setText(t.getText() + "3");
        totalClicks += 1;
    }
    void four() {
        t.setText(t.getText() + "4");
        totalClicks += 1;
    }
    void five() {
        t.setText(t.getText() + "5");
        totalClicks += 1;
    }
    void six() {
        t.setText(t.getText() + "6");
        totalClicks += 1;
    }
    void seven() {
        t.setText(t.getText() + "7");
        totalClicks += 1;
    }
    void eight() {
        t.setText(t.getText() + "8");
        totalClicks += 1;
    }
    void nine() {
        t.setText(t.getText() + "9");
        totalClicks += 1;
    }

    void add() {
        t.setText(t.getText() + "+");
        totalClicks += 1;
    }
    void subtract() {
        t.setText(t.getText() + "-");
        totalClicks += 1;
    }

    void equals() {
        String userInput = t.getText();
        System.out.println(userInput);

        String a = userInput;
        System.out.println(a);
        String operators[]=a.split("[0-9]+");
        String operands[]=a.split("[+-]");
        int agregate = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++){
            if(operators[i].equals("+"))
                agregate += Integer.parseInt(operands[i]);
            else
                agregate -= Integer.parseInt(operands[i]);
        }
        System.out.println(agregate);
        t.setText(String.valueOf(agregate));
    }
}
