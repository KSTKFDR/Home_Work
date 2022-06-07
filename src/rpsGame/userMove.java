package rpsGame;
/**
 * Класс отвечающий за определение значения (Камень, ножницы или бумага) игрока Пользователь
 *
 * @params userChoice - пользовательский ввод из класса mainRPS
 */

public class userMove {

 public static type getUserValue(String userChoice) {
     if (userChoice.equalsIgnoreCase("Камень")) {
          return type.ROCK;

       } else if (userChoice.equalsIgnoreCase("Бумага")) {
        return type.PAPER;

      } else if (userChoice.equalsIgnoreCase("Ножницы")) {
         return type.SCISSORS;

      } else System.out.println("Ну введи ты что нибудь из: Камень, Ножницы, Бумага, а то поиграть не выйдет");
       return type.UNKNOWN;
  }
}

