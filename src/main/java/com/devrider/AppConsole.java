package com.devrider;

import java.util.Scanner;

public class AppConsole {
    public static void main(String[] args) {
        RomanNumberParser romanNumberParser = new RomanNumberParser();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            Integer number = scanner.nextInt();
            System.out.print("Number " + number + " is equal to roamn number " + romanNumberParser.draw(number));
        } catch (RomanNumberOutOfRangeException e) {
            e.printStackTrace();
        }
    }
}
