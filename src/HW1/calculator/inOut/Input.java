package HW1.calculator.inOut;

import HW1.calculator.IInOut;

import java.util.Scanner;

/**
 * Класс для получения пользовательского ввода
 *
 * @params userValue - то что ввел Пользователь
 */

public class Input implements IInOut {

   private String userValue;

    @Override
    public void doInput() {
        Scanner scanner = new Scanner(System.in);
        this.userValue = scanner.nextLine();
    }

    public String getUserValue() {
        return userValue;
    }
}
