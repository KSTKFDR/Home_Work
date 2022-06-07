package rpsGame;

/**
 * Класс отвечающий за
 *
 * @params HUMAN - человек
 * @params COMPUTER - компьютер
 * @params TIE - ничья
 */
public enum gameSummary {
    HUMAN("Игрок"),
    COMPUTER("Компьютер"),
    TIE("Ничья");


    public String name;

    gameSummary(String name) {
        this.name = name;
    }

}
