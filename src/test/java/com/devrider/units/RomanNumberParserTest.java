package com.devrider.units;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.devrider.RomanNumberExceededException;
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
    public void returnIif1() throws RomanNumberExceededException {
        assertEquals("I", romanNumber.draw(1));
    }

    @Test
    public void returnIIif2() throws RomanNumberExceededException{
        assertEquals("II", romanNumber.draw(2));
    }

    @Test
    public void returnIIIif3() throws RomanNumberExceededException{
        assertEquals("III", romanNumber.draw(3));
    }

    @Test
    public void returnIVif4() throws RomanNumberExceededException{
        assertEquals("IV", romanNumber.draw(4));
    }

    @Test
    public void returnVif5() throws RomanNumberExceededException{
        assertEquals("V", romanNumber.draw(5));
    }

    @Test
    public void returnVIif6() throws RomanNumberExceededException{
        assertEquals("VI", romanNumber.draw(6));
    }

    @Test
    public void returnVIIif7() throws RomanNumberExceededException{
        assertEquals("VII", romanNumber.draw(7));
    }

    @Test
    public void returnVIIIif8() throws RomanNumberExceededException{
        assertEquals("VIII", romanNumber.draw(8));
    }

    @Test
    public void returnIXif9() throws RomanNumberExceededException{
        assertEquals("IX", romanNumber.draw(9));
    }

    @Test
    public void returnEmptyStringIf0() throws RomanNumberExceededException{
        assertEquals("", romanNumber.draw(0));
    }

    @Test
    public void returnXif10() throws RomanNumberExceededException{
        assertEquals("X", romanNumber.draw(10));
    }

    @Test
    public void returnXIif11() throws RomanNumberExceededException{
        assertEquals("XI", romanNumber.draw(11));
    }

    @Test
    public void returnXXXif30() throws RomanNumberExceededException{
        assertEquals("XXX", romanNumber.draw(30));
    }

    @Test
    public void returnXXXVIIIif34() throws RomanNumberExceededException{
        assertEquals("XXXIV", romanNumber.draw(34));
    }

    @Test
    public void returnXXXVIIIif38() throws RomanNumberExceededException{
        assertEquals("XXXVIII", romanNumber.draw(38));
    }

    @Test
    public void returnLXXXIVif84() throws RomanNumberExceededException{
        assertEquals("LXXXIV", romanNumber.draw(84));
    }

    @Test
    public void returnCDif400() throws RomanNumberExceededException{
        assertEquals("CD", romanNumber.draw(400));
    }

    @Test
    public void returnDCLXXIXif679() throws RomanNumberExceededException{
        assertEquals("DCLXXIX", romanNumber.draw(679));
    }

    @Test
    public void returnMMif2000() throws RomanNumberExceededException{
        assertEquals("MM", romanNumber.draw(2000));
    }

    @Test
    public void returnMMMMCMXCIXif4999() throws RomanNumberExceededException{
        assertEquals("MMMMCMXCIX", romanNumber.draw(4999));
    }

    @Test
    public void shouldThrowRomanNumberExceededExceptionWhenNumberBiggerThan4999() {
        assertThrows(RomanNumberExceededException.class, () -> romanNumber.draw(8347), "Expected romanNumber.draw(8347) to throw, but it didn't");
    }
}
