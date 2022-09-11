package com.calculator;

import java.util.Arrays;

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

        //if else version
        /*if (operators[i].equals("+")) {
            answerDouble += Integer.parseInt(operands[i]);
        } else if (operators[i].equals("-")) {
            answerDouble -= Integer.parseInt(operands[i]);
        } else if (operators[i].equals("*")) {
            answerDouble *= Integer.parseInt(operands[i]);
        } else if (operators[i].equals("/")) {
            answerDouble /= Integer.parseInt(operands[i]);
        } else if (operators[i].equals("%")) {
            answerDouble = (answerDouble / Integer.parseInt(operands[i])) * 100;
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



        String userInput = "528556674683684658-8+55*7/2%3";
        System.out.println(userInput);

        String[] operators = userInput.split("[0-9]");
        String[] operands = userInput.trim().split("[%+*/-]");
        System.out.println(Arrays.toString(operators));
        System.out.println(Arrays.toString(operands));


        System.out.println("1%2: " + 1 % 2);


       /*
        System.out.println(Arrays.toString(operators));
        System.out.println(Arrays.toString(operands));
        double answerDouble = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++) {
            if (operators[i].equals("")) {
                System.out.println("Hopp videre");
            } else {
                if (operators[i].equals("+"))
                    answerDouble += Integer.parseInt(operands[i]);
                else if (operators[i].equals("-")) {
                    answerDouble -= Integer.parseInt(operands[i]);
                } else if (operators[i].equals("*")) {
                    answerDouble *= Integer.parseInt(operands[i]);
                } else if (operators[i].equals("/")) {
                    answerDouble /= Integer.parseInt(operands[i]);
                } else if (operators[i].equals("%")) {
                    answerDouble *= ((double) Integer.parseInt(operands[i]) / 100);
                } else {
                    System.out.println("noe gikk galt");
                }
            }*/

        /*double answerDouble = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++){
            switch (operators[i]) {
                case "+" -> answerDouble += Integer.parseInt(operands[i]);
                case "-" -> answerDouble -= Integer.parseInt(operands[i]);
                case "*" -> answerDouble *= Integer.parseInt(operands[i]);
                case "/" -> answerDouble /= Integer.parseInt(operands[i]);
                case "%" -> answerDouble %= Integer.parseInt(operands[i]);
            }
        }
        System.out.println(answerDouble);*/
    }
}
