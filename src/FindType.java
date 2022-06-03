import furniture.Type;
/**
 * Класс отвечающий за матчинг введенного Пользователем типа мебели.
 * @params  userTypeFurniture - введенный Пользователем тип мебели
 */

public class FindType {

    public Type searchType(String userTypeFurniture) {
        if (userTypeFurniture.equalsIgnoreCase("Кровать")) {
            return Type.BED;

        } else if (userTypeFurniture.equalsIgnoreCase("Шкаф")) {
            return Type.CLOSET;

        } else if (userTypeFurniture.equalsIgnoreCase("Стол")) {
            return Type.TABLE;

        } else if (userTypeFurniture.equalsIgnoreCase("Стул")) {
            return Type.CHAIR;

        } else System.out.println("Ну введи ты что нибудь из: Кровать, Шкаф, Стол, Стул иначе будет ");
        return Type.UNKNOWN;
    }
}


