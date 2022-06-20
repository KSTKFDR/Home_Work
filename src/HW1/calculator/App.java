package HW1.calculator;

import HW1.calculator.inOut.Input;

/**
 * Мэйн класс для работы калькулятора"
 *
 * @params userInput - строка из пользовательского ввода
 * @params result - получение результата после подсчета
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Это калькулятор пиши пример он решит наверно");

        Input input = new Input();
        input.doInput();
        String userInput = input.getUserValue();

        SplitUserExercise splitUserExercise = new SplitUserExercise();
        splitUserExercise.setSplitUserExerciseNumbers(userInput);

        GetCalculation calculate = new GetCalculation(splitUserExercise);
        int result = calculate.doCalculate();
        System.out.println("Результат = " + result);
    }
}
