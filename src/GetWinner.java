import rpsGame.*;

/**
 * Класс отвечающий за игровой процесс
 *
 * @params userDrop - передаем то, что выкинул Пользователь
 * computerDrop - передаем то, что выкинул Комп
 */

public class GetWinner {

    public GameSummary getWinner(Type userDrop, Type computerDrop) {

        if (userDrop.equals(computerDrop)) {
            return GameSummary.TIE;
        }
        else if (userDrop.equals(Type.ROCK) && computerDrop.equals(Type.SCISSORS)) {
            return GameSummary.HUMAN;
        }
        else if (userDrop.equals(Type.SCISSORS) && computerDrop.equals(Type.PAPER)) {
            return GameSummary.HUMAN;
        }
        else if (userDrop.equals(Type.PAPER) && computerDrop.equals(Type.ROCK)) {
            return GameSummary.HUMAN;
        } else {
            return GameSummary.COMPUTER;
        }
    }
}
