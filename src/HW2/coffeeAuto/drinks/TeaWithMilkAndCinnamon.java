package HW2.coffeeAuto.drinks;

import HW2.coffeeAuto.DrinkCost;
import HW2.coffeeAuto.ingredients.Cinnamon;
import HW2.coffeeAuto.ingredients.Milk;
import HW2.coffeeAuto.ingredients.Tea;

/**
 * Класс напитка Чай с молоком и корицей
 *
 * @params cost - цена напитка
 */
public class TeaWithMilkAndCinnamon implements DrinkCost {

   private int cost;

    public int setDrinkCost() {
        Tea teaIng = new Tea();
        Milk milkIng = new Milk();
        Cinnamon cinnamonIng = new Cinnamon();
        this.cost = teaIng.getCost() + milkIng.getCost() + cinnamonIng.getCost();
        return cost;

    }

    @Override
    public int getDrinkCost() {
        return cost;
    }
}
