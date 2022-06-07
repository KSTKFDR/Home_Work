import rpsGame.*;

/**
 * Класс отвечающий за игровой процесс
 *
 * @params userDrop - передаем то, что выкинул Пользователь
 * computerDrop - передаем то, что выкинул Комп
 */

public class getWinner {

    public gameSummary getWinner(type userDrop, type computerDrop) {

        if (userDrop.equals(computerDrop)) {
            return gameSummary.TIE;
        }
        else if (userDrop.equals(type.ROCK) && computerDrop.equals(type.SCISSORS)) {
            return gameSummary.HUMAN;
        }
        else if (userDrop.equals(type.SCISSORS) && computerDrop.equals(type.PAPER)) {
            return gameSummary.HUMAN;
        }
        else if (userDrop.equals(type.PAPER) && computerDrop.equals(type.ROCK)) {
            return gameSummary.HUMAN;
        } else {
            return gameSummary.COMPUTER;
        }
    }
}
