package HW2.coffeeAuto.drinks;

import HW2.coffeeAuto.DrinkCost;
import HW2.coffeeAuto.ingredients.Coffee;
import HW2.coffeeAuto.ingredients.Milk;

/**
 * Класс напитка Кофе с молоком
 *
 * @params cost - цена напитка
 */
public class CoffeeWithMilk implements DrinkCost {
    private int cost;

    public int setDrinkCost() {
        Coffee coffeeIng = new Coffee();
        Milk milkIng = new Milk();
        this.cost = coffeeIng.getCost() + milkIng.getCost();
        return cost;

    }

    @Override
    public int getDrinkCost() {
        return cost;
    }

}