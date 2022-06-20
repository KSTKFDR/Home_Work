package HW2.coffeeAuto.ingredients;

import HW2.coffeeAuto.Ingredients;

/**
 * Класс ингредиента Чай
 *
 * @return - цена ингредиента
 */
public class Tea implements Ingredients {

    @Override
    public int getCost() {
        return 8;
    }
}