package com.calculator;

import javax.sound.midi.Soundbank;
import java.io.Console;

class Tester {
    public static void main(String[] args) {
        /*String userInput = "100+50-20";

        for (int i=0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            *//*int operatorCount = 0;*//*

            if (c == '+') {
                System.out.println("+");
            } else if (c == '-') {
                System.out.println("-");
            } else {
                System.out.print(c);
            }

        }*/


        //WORKING:
        /*String a = "7-8";
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
        System.out.println(agregate);*/
    }
}
