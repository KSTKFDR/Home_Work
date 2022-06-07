import rpsGame.*;
import java.util.Scanner;

/**
 * Майн класс для игры камень ножницы бумага
 *
 * @params userChoice - выбор камня, ножниц или бумаги. Пользовательский ввод
 */

public class MainRPS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ход игрока! Для игры введите: Камень, ножницы или бумага");
        String userChoice = scanner.nextLine();

        Type userDrop = UserMove.getUserValue(userChoice);
        System.out.println("Человек выкидывает " + userDrop);

        System.out.println("Ход Компьютера");
        Type computerDrop = ComputerMove.getComputerRandom();
        System.out.println("Компьютер выкидывает " + computerDrop );

        System.out.println("Вычисление победителя");
        GetWinner gameProcess = new GetWinner();
        System.out.println("Победил = " + gameProcess.getWinner(userDrop,computerDrop));
    }
}