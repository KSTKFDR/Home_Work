package HW1.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Юнит тест отвечающий за тестирование калькулятора.
 */
public class TestCalculation {

    @Test
    public void TestCalculation() {
        SplitUserExercise splitUserExerciseTest = new SplitUserExercise();
        splitUserExerciseTest.setSplitUserExerciseNumbers("2 - 2");
        GetCalculation calculate = new GetCalculation(splitUserExerciseTest);
        int result = calculate.doCalculate();
        assertEquals(0, result);

    }

}

