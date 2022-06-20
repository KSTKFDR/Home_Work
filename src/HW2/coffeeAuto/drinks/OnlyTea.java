package HW2.coffeeAuto.drinks;

import HW2.coffeeAuto.DrinkCost;
import HW2.coffeeAuto.ingredients.Tea;

/**
 * Класс напитка Чай
 *
 * @params cost - цена напитка
 */
public class OnlyTea implements DrinkCost {
   private int cost;

    public int setDrinkCost() {
        Tea tea = new Tea();
        return this.cost = tea.getCost();
    }

    @Override
    public int getDrinkCost() {
        return cost;
    }
}

