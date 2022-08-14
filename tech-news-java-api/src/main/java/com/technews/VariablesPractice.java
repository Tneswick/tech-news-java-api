package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        int num1 = 3;
        double num2 = 4.50;
        String words = "These Words";

        // calculated variable sum is a double
        double sum = num1 + num2;

        // calculated variable concat is a String
        String concat = num1 + words;

        // value of sum is 7.50
        System.out.println(sum);

        // value of concat is "3These Words"
        System.out.println(concat);
    }
}
