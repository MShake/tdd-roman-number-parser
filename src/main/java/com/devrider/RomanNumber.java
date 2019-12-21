package com.devrider;

public class RomanNumber {

    public static final String[] UNIT = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public static final String[] THOUSANDS = {"", "M", "MM", "MMM", "MMMM"};

    public String draw(int number) {
        return computeNumber(number);
    }

    private String computeNumber(int number) {
        String reverseNumber = reverseNumber(number);
        StringBuilder romanNumber = new StringBuilder();

        if (reverseNumber.length() >= 4)
            romanNumber.append(getThousandsSymbol(Integer.parseInt(reverseNumber.substring(3, 4))));
        if (reverseNumber.length() >= 3)
            romanNumber.append(getHundredsSymbol(Integer.parseInt(reverseNumber.substring(2, 3))));
        if (reverseNumber.length() >= 2)
            romanNumber.append(getTensSymbol(Integer.parseInt(reverseNumber.substring(1, 2))));
        romanNumber.append(getUnitSymbol(Integer.parseInt(reverseNumber.substring(0, 1))));

        return romanNumber.toString();
    }

    // TODO: REFACTOR to be SRP (Single Responsibility Principle) compliant
    private String reverseNumber(int number) {
        return new StringBuilder().append(number).reverse().toString();
    }

    private String getUnitSymbol(int index) {
        return UNIT[index];
    }

    private String getTensSymbol(int index) {
        return TENS[index];
    }

    private String getHundredsSymbol(int index) {
        return HUNDREDS[index];
    }

    private String getThousandsSymbol(int index) {
        return THOUSANDS[index];
    }
}

