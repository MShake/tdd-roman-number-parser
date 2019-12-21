package com.devrider.units;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devrider.RomanNumberParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RomanNumberParserTest {

    private RomanNumberParser romanNumber;

    @BeforeEach
    public void setUp() {
        romanNumber = new RomanNumberParser();
    }

    @Test
    public void returnIif1() {
        assertEquals("I", romanNumber.draw(1));
    }

    @Test
    public void returnIIif2() {
        assertEquals("II", romanNumber.draw(2));
    }

    @Test
    public void returnIIIif3() {
        assertEquals("III", romanNumber.draw(3));
    }

    @Test
    public void returnIVif4() {
        assertEquals("IV", romanNumber.draw(4));
    }

    @Test
    public void returnVif5() {
        assertEquals("V", romanNumber.draw(5));
    }

    @Test
    public void returnVIif6() {
        assertEquals("VI", romanNumber.draw(6));
    }

    @Test
    public void returnVIIif7() {
        assertEquals("VII", romanNumber.draw(7));
    }

    @Test
    public void returnVIIIif8() {
        assertEquals("VIII", romanNumber.draw(8));
    }

    @Test
    public void returnIXif9() {
        assertEquals("IX", romanNumber.draw(9));
    }

    @Test
    public void returnEmptyStringIf0() {
        assertEquals("", romanNumber.draw(0));
    }

    @Test
    public void returnXif10() {
        assertEquals("X", romanNumber.draw(10));
    }

    @Test
    public void returnXIif11() {
        assertEquals("XI", romanNumber.draw(11));
    }

    @Test
    public void returnXXXif30() {
        assertEquals("XXX", romanNumber.draw(30));
    }

    @Test
    public void returnXXXVIIIif34() {
        assertEquals("XXXIV", romanNumber.draw(34));
    }

    @Test
    public void returnXXXVIIIif38() {
        assertEquals("XXXVIII", romanNumber.draw(38));
    }

    @Test
    public void returnLXXXIVif84() {
        assertEquals("LXXXIV", romanNumber.draw(84));
    }

    @Test
    public void returnCDif400() {
        assertEquals("CD", romanNumber.draw(400));
    }

    @Test
    public void returnDCLXXIXif679() {
        assertEquals("DCLXXIX", romanNumber.draw(679));
    }

    @Test
    public void returnMMif2000() {
        assertEquals("MM", romanNumber.draw(2000));
    }

    @Test
    public void returnMMMMCMXCIXif4999() {
        assertEquals("MMMMCMXCIX", romanNumber.draw(4999));
    }
}
