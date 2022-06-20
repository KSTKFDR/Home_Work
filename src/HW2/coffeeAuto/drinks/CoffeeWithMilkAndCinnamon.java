package HW2.coffeeAuto.drinks;

import HW2.coffeeAuto.DrinkCost;
import HW2.coffeeAuto.ingredients.Cinnamon;
import HW2.coffeeAuto.ingredients.Coffee;
import HW2.coffeeAuto.ingredients.Milk;

/**
 * Класс напитка Кофе с молоком и корицей
 *
 * @params cost - цена напитка
 */
public class CoffeeWithMilkAndCinnamon implements DrinkCost {
    public int cost;

    public int setDrinkCost() {
        Coffee coffeeIng = new Coffee();
        Milk milkIng = new Milk();
        Cinnamon cinnamonIng = new Cinnamon();
        this.cost = coffeeIng.getCost() + milkIng.getCost() + cinnamonIng.getCost();
        return cost;

    }

    @Override
    public int getDrinkCost() {
        return cost;
    }

}
