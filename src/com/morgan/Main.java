package com.morgan;

public class Main {

    public static void main(String[] args) {

        int max = 1;
        int min = 8;
        int number;
        int number2;

        number = (int) ((Math.random() * (max - min)) + min);
        number2 = (int) ((Math.random() * (max - min)) + min);

        while (number == number2) {
            number = (int) ((Math.random() * (max - min)) + min);
            number2 = (int) ((Math.random() * (max - min)) + min);
        }
            System.out.println(number + " is sus!");
            System.out.println(number2 + " is sus!");

    }
}
