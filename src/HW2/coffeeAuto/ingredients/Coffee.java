package HW2.coffeeAuto.ingredients;

import HW2.coffeeAuto.Ingredients;

/**
 * Класс ингредиента Кофе
 *
 * @return - цена ингредиента
 */

public class Coffee implements Ingredients {

    @Override
    public int getCost() {
        return 10;

    }
}

