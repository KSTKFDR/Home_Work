package HW2.coffeeAuto;

import HW2.coffeeAuto.inOut.Input;
/**
 * Мэйн класс кофейного автомата
 *
 * @params - userChoice - пользовательский ввод
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Это кофейный автомат. Выберите напиток и мы скажем сколько он стоит");
        System.out.println("Можно выбрать: \n 1.Кофе\n 2.Чай\n 3.Кофе с молоком\n 4.Чай с молоком\n 5.Кофе с молоком и корицей\n 6.Чай с молоком и корицей\n/////////////////////////////\nВведите номер напитка");

        Input input = new Input();
        input.doInput();
        int userChoice = input.getUserChoice();

        GetDrinksCost doDrinkCost = new GetDrinksCost();
        System.out.println("Цена напитка "+ (doDrinkCost.doDrinksCost(userChoice)) + " рублей");

    }

}
