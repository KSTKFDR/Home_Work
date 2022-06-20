package HW2.coffeeAuto;

import HW2.coffeeAuto.drinks.*;
/**
 * Класс получения цены напитков из ассортимента
 *
 * @params - userChoice - пользовательский ввод
 */
public class GetDrinksCost {

    public int doDrinksCost(int userChoice) {

        if (userChoice == 1) {
            OnlyCoffee onlyCoffee = new OnlyCoffee();
            onlyCoffee.setDrinkCost();
            return onlyCoffee.getDrinkCost();

        } else if (userChoice == 2) {
            OnlyTea onlyTea = new OnlyTea();
            onlyTea.setDrinkCost();
            return onlyTea.getDrinkCost();

        } else if (userChoice == 3) {
            CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk();
            coffeeWithMilk.setDrinkCost();
            return coffeeWithMilk.getDrinkCost();

        } else if (userChoice == 4) {
            TeaWithMilk teaWithMilk = new TeaWithMilk();
            teaWithMilk.setDrinkCost();
            return teaWithMilk.getDrinkCost();

        } else if (userChoice == 5) {
            CoffeeWithMilkAndCinnamon coffeeWithMilkAndCinnamon = new CoffeeWithMilkAndCinnamon();
            coffeeWithMilkAndCinnamon.setDrinkCost();
            return coffeeWithMilkAndCinnamon.getDrinkCost();

        } else if (userChoice == 6) {
            TeaWithMilkAndCinnamon teaWithMilkAndCinnamon = new TeaWithMilkAndCinnamon();
            teaWithMilkAndCinnamon.setDrinkCost();
            return teaWithMilkAndCinnamon.getDrinkCost();

        } else {
            UnknownDrink unknownDrink = new UnknownDrink();
            unknownDrink.setDrinkCost();
            return unknownDrink.getDrinkCost();
        }

    }

}


