import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void additionTest() {
        Calculator addTest = new Calculator();
        assertEquals(4, addTest.addition(2, 2));

    }

    @Test
    public void subtractionTest() {
        Calculator subTest = new Calculator();
        assertEquals(0, subTest.subtraction(2, 2));

    }

    @Test
    public void multiplicationTest() {
        Calculator multiplyTest = new Calculator();
        assertEquals(4, multiplyTest.multiplication(2, 2));
    }

    @Test
    public void divideTest() {
        Calculator divTest = new Calculator();
        assertEquals(1, divTest.divide(2, 2));
    }
}



