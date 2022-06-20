package HW2.coffeeAuto.ingredients;

import HW2.coffeeAuto.Ingredients;

/**
 * Класс ингредиента Молоко
 *
 * @return - цена ингредиента
 */
public class Milk implements Ingredients {
    @Override
    public int getCost() {
        return 5;
    }
}