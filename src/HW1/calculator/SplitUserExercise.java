package HW1.calculator;

/**
 * Класс с логикой разделения пользовательского ввода
 *
 * @params firstNumber - первый операнд
 * @params secondNumber - второй операнд
 * @params operation - операция
 */
public class SplitUserExercise {

    private int firstNumber;
    private int secondNumber;
    private String operand;


    public void setSplitUserExerciseNumbers(String userEnterExercise) {
        String[] userOperands = (userEnterExercise.split(" "));
        this.firstNumber = Integer.parseInt(userOperands[0]);
        this.secondNumber = Integer.parseInt(userOperands[2]);
        this.operand = userOperands[1];

    }

    public int getFirstNumber() {
        return firstNumber;

    }

    public int getSecondNumber() {
        return secondNumber;

    }

    public String getOperand() {
        return operand;

    }

}
