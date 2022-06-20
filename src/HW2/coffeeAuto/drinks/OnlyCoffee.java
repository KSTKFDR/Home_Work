package HW2.coffeeAuto.drinks;


import HW2.coffeeAuto.DrinkCost;
import HW2.coffeeAuto.ingredients.Coffee;

/**
 * Класс напитка Кофе
 *
 * @params cost - цена напитка
 */
public class OnlyCoffee implements DrinkCost {
   private int cost;

    public int setDrinkCost() {
        Coffee coffee = new Coffee();
        return this.cost = coffee.getCost();
    }

    @Override
    public int getDrinkCost() {
        return cost;
    }
}
