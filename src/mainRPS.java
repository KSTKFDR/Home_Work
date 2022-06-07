import rpsGame.*;
import java.util.Scanner;

/**
 * Майн класс для игры камень ножницы бумага
 *
 * @params userChoice - выбор камня, ножниц или бумаги. Пользовательский ввод
 */

public class mainRPS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ход игрока! Для игры введите: Камень, ножницы или бумага");
        String userChoice = scanner.nextLine();

        type userDrop = userMove.getUserValue(userChoice);
        System.out.println("Человек выкидывает " + userDrop);

        System.out.println("Ход Компьютера");
        type computerDrop = computerMove.getComputerRandom();
        System.out.println("Компьютер выкидывает " + computerDrop );

        System.out.println("Вычисление победителя");
        getWinner gameProcess = new getWinner();
        System.out.println("Победил = " + gameProcess.getWinner(userDrop,computerDrop));
    }
}