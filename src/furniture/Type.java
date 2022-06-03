package furniture;
/**
 * Статический класс отвечающий за список доступной мебели
 * @params  CHAIR - стул
 * @params  BED- кровать
 * @params  TABLE - стол
 * @params  CLOSET - шкаф
 * @params  UNKNOWN - неизвестная мебель
 */
public enum Type {
    CHAIR("Стул"),
    BED("Кровать"),
    TABLE("Стол"),
    CLOSET("Шкаф"),
    UNKNOWN("Неизвестно");

    public String name;

    Type(String name) {
        this.name = name;
    }

}
