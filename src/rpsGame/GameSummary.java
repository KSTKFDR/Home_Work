package rpsGame;

/**
 * Класс отвечающий за
 *
 * @params HUMAN - человек
 * @params COMPUTER - компьютер
 * @params TIE - ничья
 */
public enum GameSummary {
    HUMAN("Игрок"),
    COMPUTER("Компьютер"),
    TIE("Ничья");


    public String name;

    GameSummary(String name) {
        this.name = name;
    }

}
