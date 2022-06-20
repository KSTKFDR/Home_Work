package HW2.coffeeAuto.inOut;

import HW2.coffeeAuto.IInOut;

import java.util.Scanner;

/**
 * Класс для получения пользовательского ввода
 *
 * @params userValue - то что ввел Пользователь
 */

public class Input implements IInOut {

   private int userChoice;

    @Override
    public void doInput() {
        Scanner scanner = new Scanner(System.in);
        this.userChoice = scanner.nextInt();
    }

    public int getUserChoice() {
        return userChoice;
    }
}
