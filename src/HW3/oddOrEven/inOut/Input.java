package HW3.oddOrEven.inOut;
import HW3.oddOrEven.IInOut;

import java.util.Scanner;

/**
 * Класс для получения пользовательского ввода
 *
 * @params userValue - то что ввел Пользователь
 */

public class Input implements IInOut {

   int userChoice;

    @Override
    public void doInput() {
        Scanner scanner = new Scanner(System.in);
        this.userChoice = scanner.nextInt();
    }

    public int getUserChoice() {
        return userChoice;
    }
}
