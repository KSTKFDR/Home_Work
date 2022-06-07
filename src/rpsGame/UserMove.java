package rpsGame;
/**
 * Класс отвечающий за определение значения (Камень, ножницы или бумага) игрока Пользователь
 *
 * @params userChoice - пользовательский ввод из класса mainRPS
 */

public class UserMove {

 public static Type getUserValue(String userChoice) {
     if (userChoice.equalsIgnoreCase("Камень")) {
          return Type.ROCK;

       } else if (userChoice.equalsIgnoreCase("Бумага")) {
        return Type.PAPER;

      } else if (userChoice.equalsIgnoreCase("Ножницы")) {
         return Type.SCISSORS;

      } else System.out.println("Ну введи ты что нибудь из: Камень, Ножницы, Бумага, а то поиграть не выйдет");
       return Type.UNKNOWN;
  }
}

