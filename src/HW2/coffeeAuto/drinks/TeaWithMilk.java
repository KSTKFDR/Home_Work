package HW2.coffeeAuto.drinks;

import HW2.coffeeAuto.DrinkCost;
import HW2.coffeeAuto.ingredients.Milk;
import HW2.coffeeAuto.ingredients.Tea;

/**
 * Класс напитка Чай с молоком
 *
 * @params cost - цена напитка
 */
public class TeaWithMilk implements DrinkCost {

    private int cost;

    public int setDrinkCost() {
        Tea teaIng = new Tea();
        Milk milkIng = new Milk();
        this.cost = teaIng.getCost() + milkIng.getCost();
        return cost;

    }

    @Override
    public int getDrinkCost() {
        return cost;
    }
}
