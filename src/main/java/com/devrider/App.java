package com.devrider;

public class App {
    public static void main(String[] args) {
        RomanNumberParser romanNumberParser = new RomanNumberParser();
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(number + " = " + romanNumberParser.draw(number));
        } catch (RomanNumberOutOfRangeException e) {
            e.printStackTrace();
        }
    }
}
