import org.junit.Test;
import rpsGame.*;

import static org.junit.Assert.assertEquals;

public class rpsTest {
    /**
     * Юнит тест отвечающий за тестирование игры.
     */

    @Test
    public void RPSGameTest() {
        userMove userMoveTest = new userMove();
        assertEquals(type.ROCK, userMoveTest.getUserValue("Камень"));
        type userTest = userMoveTest.getUserValue("Камень");

        computerMove computerMoveTest = new computerMove();
        type computerTest = computerMoveTest.getComputerRandom();
        assertEquals(type.ROCK, computerMoveTest.getComputerRandom());

        getWinner gameProcess = new getWinner();
        System.out.println("Победил = " + gameProcess.getWinner(userTest, computerTest));
        assertEquals(gameSummary.TIE, gameProcess.getWinner(userTest, computerTest));
    }
}


