package HW1.calculator;

import HW1.calculator.action.AddictionAction;
import HW1.calculator.action.DivideAction;
import HW1.calculator.action.MultiplicationAction;
import HW1.calculator.action.SubstractionAction;

/**
 * Класс с логикой подсчета
 *
 * @params firstNumber - первый операнд
 * @params secondNumber - второй операнд
 * @params operation - операция
 *
 */

public class GetCalculation {

   private SplitUserExercise splitUserExercise;

    public GetCalculation(SplitUserExercise splitUserExercise) {
        this.splitUserExercise = splitUserExercise;
    }

    public int doCalculate() {

        SplitUserExercise numbers = splitUserExercise;
        int firstNumber = numbers.getFirstNumber();
        int secondNumber = numbers.getSecondNumber();

        SplitUserExercise operations = splitUserExercise;
        String operation = operations.getOperand();

        if (operation.equalsIgnoreCase("+")) {
            AddictionAction addictionAction = new AddictionAction();
            return addictionAction.doCalculate(firstNumber, secondNumber);
        }
        if (operation.equalsIgnoreCase("-")) {
            SubstractionAction substractionAction = new SubstractionAction();
            return substractionAction.doCalculate(firstNumber, secondNumber);
        }
        if (operation.equalsIgnoreCase("*")) {
            MultiplicationAction multiplicationAction = new MultiplicationAction();
            return multiplicationAction.doCalculate(firstNumber, secondNumber);
        }
        if (operation.equalsIgnoreCase("/")) {
            DivideAction divideAction = new DivideAction();
            return divideAction.doCalculate(firstNumber, secondNumber);
        }
        return 0;
    }
}