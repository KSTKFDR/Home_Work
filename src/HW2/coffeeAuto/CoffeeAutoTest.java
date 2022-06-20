package HW2.coffeeAuto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Юнит тест отвечающий за тестирование калькулятора.
 */
public class CoffeeAutoTest {
    @Test
    public void TestCoffeeAuto() {
        GetDrinksCost doDrinkCostTest = new GetDrinksCost();
        assertEquals(8, doDrinkCostTest.doDrinksCost(2));
    }
}



