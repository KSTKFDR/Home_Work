package rpsGame;
/**
 * Класс отвечающий за...
 */

public class UserMove {
    Type UserMove;

    public UserMove(String userChoice) {
        this.UserMove = setUserValue(userChoice);

    }

    public Type setUserValue(String userChoice) {
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

