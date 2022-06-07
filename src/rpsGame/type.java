package rpsGame;

/**
 * Класс отвечающий за хранение доступных типов (Камень, ножницы или бумага).
 *
 * @params ROCK - камень
 * @params PAPER - бумага
 * @params SCISSORS- ножницы
 * @params UNKNOWN - неизвестное значение (актуально для пользовательского ввода)
 */

public enum type {
    ROCK("Камень"),
    PAPER("Бумага"),
    SCISSORS("Ножницы"),
    UNKNOWN("Ввели не то");

    public String name;

    type(String name) {
        this.name = name;
    }

}


