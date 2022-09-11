package com.calculator;

import javax.swing.*;
import java.util.Arrays;

public class Calc{
    JTextArea t = new JTextArea();

    int totalClicks;
    void erase() {
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
    void comma() {
        t.setText(t.getText() + ",");
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
        t.setText(t.getText() + " + ");
        totalClicks += 1;
    }
    void subtract() {
        t.setText(t.getText() + " - ");
        totalClicks += 1;
    }
    void multiply() {
        t.setText(t.getText() + " * ");
        totalClicks += 1;
    }
    void divide() {
        t.setText(t.getText() + " / ");
        totalClicks += 1;
    }
    void percentage() {
        t.setText(t.getText() + " % ");
        totalClicks += 1;
    }

    void equals() {
        String userInput = t.getText();
        System.out.println(userInput);

        String[] inputArray = userInput.split(" ");
        double answerDouble = Double.parseDouble(inputArray[0]);
        System.out.println(inputArray[1]);
        for (int i=1;i<inputArray.length;i++){
            System.out.println(Arrays.toString(inputArray));
            System.out.println(answerDouble);
            if (i % 2 != 0) {
                switch (inputArray[i]) {
                    case "+" -> answerDouble += Integer.parseInt(inputArray[i+1]);
                    case "-" -> answerDouble -= Integer.parseInt(inputArray[i+1]);
                    case "*" -> answerDouble *= Integer.parseInt(inputArray[i+1]);
                    case "/" -> answerDouble /= Integer.parseInt(inputArray[i+1]);
                    case "%" -> answerDouble *= (double) (Integer.parseInt(inputArray[i + 1])) /100;
                }
            }
        }

        if (answerDouble % 1 == 0) {
            long answerLong = (long)answerDouble;
            System.out.println(answerLong);
            t.setText(String.valueOf(answerLong));
        } else {
            System.out.println("answer: " + answerDouble);
            t.setText(String.valueOf(answerDouble));
        }
    }
}
