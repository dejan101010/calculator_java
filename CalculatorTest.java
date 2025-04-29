import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // Test 1: Sabiranje integera
    @Test
    public void testAdditionInteger() {
        assertEquals(5.0, Calculator.Run("2+3"));
    }

    // Test 2: Sabiranje sa znakom jednakosti
    @Test
    public void testAdditionWithEquals() {
        assertEquals("ERROR", Calculator.Run("2+3="));
    }

    // Test 3: Sabiranje sa zarezom
    @Test
    public void testAdditionWithComma() {
        assertEquals("ERROR", Calculator.Run("2,4+3,2"));
    }

    // Test 4: Sabiranje dva float broja (pogrešan rezultat)
    @Test
    public void testAdditionFloat() {
        assertEquals("ERROR", Calculator.Run("2.4+3.2"));
    }

    // Test 5: Sabiranje sa zagradama
    @Test
    public void testAdditionWithParentheses() {
        assertEquals("ERROR", Calculator.Run("2+(3+4)"));
    }

    // Test 6: Oduzimanje integera
    @Test
    public void testSubtractionInteger() {
        assertEquals(-1.0, Calculator.Run("2-3"));
    }

    // Test 7: Oduzimanje sa znakom jednakosti
    @Test
    public void testSubtractionWithEquals() {
        assertEquals("ERROR", Calculator.Run("2-3="));
    }

    // Test 8: Oduzimanje sa zarezom
    @Test
    public void testSubtractionWithComma() {
        assertEquals("ERROR", Calculator.Run("2,0-3,0"));
    }

    // Test 9: Oduzimanje dva float broja
    @Test
    public void testSubtractionFloat() {
        assertEquals(-1.0, Calculator.Run("2.0-3.0"));
    }

    // Test 10: Oduzimanje sa zagradama
    @Test
    public void testSubtractionWithParentheses() {
        assertEquals("ERROR", Calculator.Run("5-(4-1)"));
    }

    // Test 11: Sabiranje sa negativnim brojem
    @Test
    public void testAdditionWithNegativeInteger() {
        assertEquals(-2.0, Calculator.Run("-7+5"));
    }

    // Test 12: Sabiranje dva negativna broja
    @Test
    public void testAdditionNegativeIntegers() {
        assertEquals("ERROR", Calculator.Run("-2+(-3)"));
    }

    // Test 13: Množenje integera
    @Test
    public void testMultiplicationInteger() {
        assertEquals(6.0, Calculator.Run("2*3"));
    }

    // Test 14: Množenje sa zarezom
    @Test
    public void testMultiplicationWithComma() {
        assertEquals("ERROR", Calculator.Run("2,0*3,0"));
    }

    // Test 15: Množenje float brojeva
    @Test
    public void testMultiplicationFloat() {
        assertEquals(6.0, Calculator.Run("2.0*3.0"));
    }

    // Test 16: Deljenje dva integera
    @Test
    public void testDivisionInteger() {
        assertEquals(1.5, Calculator.Run("3/2"));
    }

    // Test 17: Deljenje dva float broja
    @Test
    public void testDivisionFloat() {
        assertEquals(1.75, Calculator.Run("3.5/2.0"));
    }

    // Test 18: Deljenje sa nulom
    @Test
    public void testDivisionByZero() {
        assertEquals("Infinity", Calculator.Run("5/0"));
    }

    // Test 19: Mešanje operacija
    @Test
    public void testMixedOperations() {
        assertEquals(17.0, Calculator.Run("2+3*5"));
    }

    // Test 20: Greska pri unosu podataka
    @Test
    public void testErrorInInput() {
        assertEquals("ERROR", Calculator.Run("5--3"));
    }

    // Test 21: Korišćenje razmaka u izrazu
    @Test
    public void testSpaceInExpression() {
        assertEquals("ERROR", Calculator.Run("5 + 3"));
    }
}
