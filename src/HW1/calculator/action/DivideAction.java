package HW1.calculator.action;

import HW1.calculator.ICalculate;
/**
 * Класс для вычисления деления
 *
 * @params firstNumber - первый операнд
 * @params secondNumber - второй операнд
 */
public class DivideAction implements ICalculate {

    @Override
    public int doCalculate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;

    }
}
