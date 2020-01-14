package com.devrider;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberParser {
    public static final Map<Integer, String[]> symbols = new HashMap<Integer, String[]>() {{
        put(1, new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"});
        put(2, new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"});
        put(3, new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"});
        put(4, new String[] {"", "M", "MM", "MMM", "MMMM"});
    }};

    public String draw(int number) throws RomanNumberOutOfRangeException {
        if (number < 0 || number > 4999)
            throw new RomanNumberOutOfRangeException("Number out of roman range");
        if (number == 0 )
            return "nulla";
        return computeNumber(number);
    }

    private String computeNumber(int number) {

        String reverseNumber = reverseNumber(number);
        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < reverseNumber.length(); i++)
            romanNumber.append(getSymbol(reverseNumber.length() - i, Integer.parseInt(reverseNumber.substring(reverseNumber.length() - i - 1, reverseNumber.length() - i))));

        return romanNumber.toString();
    }

    private String reverseNumber(int number) {
        return new StringBuilder().append(number).reverse().toString();
    }

    private String getSymbol(int size, int index) {
        return symbols.get(size)[index];
    }
}



