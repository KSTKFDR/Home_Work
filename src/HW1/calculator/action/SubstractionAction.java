package HW1.calculator.action;

import HW1.calculator.ICalculate;
/**
 * Класс для вычисления вычитания
 *
 * @params firstNumber - первый операнд
 * @params secondNumber - второй операнд
 */

public class SubstractionAction implements ICalculate {

    @Override
    public int doCalculate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
