package HW2.coffeeAuto.ingredients;

import HW2.coffeeAuto.Ingredients;

/**
 * Класс ингредиента корица
 *
 * @return - цена ингредиента
 */

public class Cinnamon implements Ingredients {
    @Override
   public int getCost() {
        return 2;

    }
}
