import rpsGame.*;

/**
 * Класс отвечающий за игровой процесс
 */

public class GetWinner {

    public Players GetWinner(UserMove userMove, ComputerMove computerMove) { //мне кажется сюда ничего не приходит просто (через дебагер, не понял)

        if (userMove.equals(computerMove)) {
            return Players.TIE;
        } else if (userMove.equals(Type.ROCK) && computerMove.equals(Type.SCISSORS)
                || (userMove.equals(Type.SCISSORS) && computerMove.equals(Type.PAPER))
                || (userMove.equals(Type.PAPER) && computerMove.equals(Type.ROCK))) {
            return Players.HUMAN;
        } else {
            return Players.COMPUTER;

        }

    }

}