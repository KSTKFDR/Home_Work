package rpsGame;

/**
 * Класс отвечающий за генерацию значения (Камень, ножницы или бумага) игрока Компьютер.
 */
public class computerMove {
    public static type getComputerRandom() {
        int computerRandom = (int) (Math.random() * (4 - 1) + 1);
        if (computerRandom == 1) {
            return type.ROCK;

       } else if (computerRandom == 2) {
         return type.PAPER;

        } else if (computerRandom == 3) {
          return type.SCISSORS;

        } else System.out.println("КОМП ГЕНЕРИРУЕТ НЕВЕРНО");
        return null;
    }
}
