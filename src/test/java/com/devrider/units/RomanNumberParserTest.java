package com.devrider.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.devrider.RomanNumberOutOfRangeException;
import com.devrider.RomanNumberParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


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

    @ParameterizedTest(name = "{1} should return {0}")
    @CsvSource({"I,1","II,2","III,3","IV,4","V,5","VI,6","VII,7","VIII,8","IX,9"})
    void shouldComputeNumberWithUnits(String romanTen, int number) throws RomanNumberOutOfRangeException {
        assertEquals(romanTen, romanNumber.draw(number));
    }

    @ParameterizedTest(name = "{1} should return {0}")
    @CsvSource({"X,10","XI,11","XXX,30","XXXIV,34","XXXVIII,38","LXXXIV,84"})
    void shouldComputeNumberWithTens(String romanTen, int number) throws RomanNumberOutOfRangeException {
        assertEquals(romanTen, romanNumber.draw(number));
    }

    @ParameterizedTest(name = "{1} should return {0}")
    @CsvSource({"CD,400","DCLXXIX,679"})
    void shouldComputeNumberWithHundreds(String romanTen, int number) throws RomanNumberOutOfRangeException {
        assertEquals(romanTen, romanNumber.draw(number));
    }

    @ParameterizedTest(name = "{1} should return {0}")
    @CsvSource({"MM,2000","MMMMCMXCIX,4999"})
    void shouldComputeNumberWithThousands(String romanTen, int number) throws RomanNumberOutOfRangeException {
        assertEquals(romanTen, romanNumber.draw(number));
    }

    @Nested
    class shouldThrowRomanNumberOutOfRangeException {

        @Test
        public void whenNumberBiggerThan4999() {
            assertThrows(RomanNumberOutOfRangeException.class, () -> romanNumber.draw(8347));
        }

        @Test
        public void whenNumberSmallerThan0() {
            assertThrows(RomanNumberOutOfRangeException.class, () -> romanNumber.draw(-238));
        }

        @Test
        public void withHumanReadableMessage() {
            Exception exception = assertThrows(RomanNumberOutOfRangeException.class, () -> romanNumber.draw(10987));
            assertEquals(exception.getMessage(), "Number out of roman range");
        }
    }


}
