import furniture.*;
import java.util.Scanner;
/**
 * Майн класс для генератора мебели
 * @params  userNameFurniture - наименование мебели. Пользовательский ввод
 * @params  userColorFurniture - цвет мебели. Пользовательский ввод
 * @params  userTypeFurniture - тип мебели. Пользовательский ввод
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите наименование мебели");
        String userNameFurniture = scanner.nextLine();

        System.out.println("Введите цвет мебели");
        String userColorFurniture = scanner.nextLine();

        System.out.println("Введите тип мебели");
        String userTypeFurniture = scanner.nextLine();

        System.out.println("Вот такая мебель получается");

        Name furnitureName = new Name();
        furnitureName.setName(userNameFurniture);
        System.out.println("Название = " + furnitureName.getName());

        Color furnitureColor = new Color();
        furnitureColor.setColor(userColorFurniture);
        System.out.println("Цвет = " + furnitureColor.getColor());

        FindType furnitureType = new FindType();
        System.out.println("Тип = " + furnitureType.searchType(userTypeFurniture));
    }
}
