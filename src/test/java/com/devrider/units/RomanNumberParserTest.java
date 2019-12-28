package com.devrider.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.devrider.RomanNumberOutOfRangeException;
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
    public void returnNullaIf0() throws RomanNumberOutOfRangeException{
        assertEquals("nulla", romanNumber.draw(0));
    }

    @Test
    public void returnIif1() throws RomanNumberOutOfRangeException {
        assertEquals("I", romanNumber.draw(1));
    }

    @Test
    public void returnIIif2() throws RomanNumberOutOfRangeException{
        assertEquals("II", romanNumber.draw(2));
    }

    @Test
    public void returnIIIif3() throws RomanNumberOutOfRangeException{
        assertEquals("III", romanNumber.draw(3));
    }

    @Test
    public void returnIVif4() throws RomanNumberOutOfRangeException{
        assertEquals("IV", romanNumber.draw(4));
    }

    @Test
    public void returnVif5() throws RomanNumberOutOfRangeException{
        assertEquals("V", romanNumber.draw(5));
    }

    @Test
    public void returnVIif6() throws RomanNumberOutOfRangeException{
        assertEquals("VI", romanNumber.draw(6));
    }

    @Test
    public void returnVIIif7() throws RomanNumberOutOfRangeException{
        assertEquals("VII", romanNumber.draw(7));
    }

    @Test
    public void returnVIIIif8() throws RomanNumberOutOfRangeException{
        assertEquals("VIII", romanNumber.draw(8));
    }

    @Test
    public void returnIXif9() throws RomanNumberOutOfRangeException{
        assertEquals("IX", romanNumber.draw(9));
    }

    @Test
    public void returnXif10() throws RomanNumberOutOfRangeException{
        assertEquals("X", romanNumber.draw(10));
    }

    @Test
    public void returnXIif11() throws RomanNumberOutOfRangeException{
        assertEquals("XI", romanNumber.draw(11));
    }

    @Test
    public void returnXXXif30() throws RomanNumberOutOfRangeException{
        assertEquals("XXX", romanNumber.draw(30));
    }

    @Test
    public void returnXXXVIIIif34() throws RomanNumberOutOfRangeException{
        assertEquals("XXXIV", romanNumber.draw(34));
    }

    @Test
    public void returnXXXVIIIif38() throws RomanNumberOutOfRangeException{
        assertEquals("XXXVIII", romanNumber.draw(38));
    }

    @Test
    public void returnLXXXIVif84() throws RomanNumberOutOfRangeException{
        assertEquals("LXXXIV", romanNumber.draw(84));
    }

    @Test
    public void returnCDif400() throws RomanNumberOutOfRangeException{
        assertEquals("CD", romanNumber.draw(400));
    }

    @Test
    public void returnDCLXXIXif679() throws RomanNumberOutOfRangeException{
        assertEquals("DCLXXIX", romanNumber.draw(679));
    }

    @Test
    public void returnMMif2000() throws RomanNumberOutOfRangeException{
        assertEquals("MM", romanNumber.draw(2000));
    }

    @Test
    public void returnMMMMCMXCIXif4999() throws RomanNumberOutOfRangeException{
        assertEquals("MMMMCMXCIX", romanNumber.draw(4999));
    }

    @Test
    public void shouldThrowRomanNumberOutOfRangeExceptionWhenNumberBiggerThan4999() {
        assertThrows(RomanNumberOutOfRangeException.class, () -> romanNumber.draw(8347));
    }

    @Test
    public void shouldThrowRomanNumberOutOfRangeExceptionWhenNumberSmallerThan0() {
        assertThrows(RomanNumberOutOfRangeException.class, () -> romanNumber.draw(-238));
    }
}
