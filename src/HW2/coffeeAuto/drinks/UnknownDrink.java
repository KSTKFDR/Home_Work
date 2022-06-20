package HW2.coffeeAuto.drinks;

import HW2.coffeeAuto.DrinkCost;

/**
 * Класс напитка которого нет в меню
 *
 * @params cost - цена напитка, всегда 0
 */

public class UnknownDrink implements DrinkCost {
    private int cost;

    public void setDrinkCost() {
        System.out.println("Нет такого напитка у нас");

    }

    @Override
    public int getDrinkCost() {
        return cost;
    }

}

