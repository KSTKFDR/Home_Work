package rpsGame;

/**
 * Класс отвечающий за генерацию значения (Камень, ножницы или бумага) игрока Компьютер.
 */
public class ComputerMove {
    Type computerMove;

    public ComputerMove() {
    this.computerMove = getComputerRandom();
    }

    public Type getComputerRandom() {
        int computerRandom = (int) (Math.random() * (3 - 1) + 1);
        if (computerRandom == 1) {
            return Type.ROCK;
        } else if (computerRandom == 2) {
            return Type.PAPER;
        } else if (computerRandom == 3) {
            return Type.SCISSORS;
        } else System.out.println("КОМП ГЕНЕРИРУЕТ НЕВЕРНО");
        return null;
    }
}