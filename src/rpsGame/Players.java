package rpsGame;

/**
 * Класс отвечающий за...
 */
public enum Players {
    HUMAN("Игрок"),
    COMPUTER("Компьютер"),
    TIE ("Ничья");


    public String name;

    Players (String name) {
        this.name = name;
    }

}
