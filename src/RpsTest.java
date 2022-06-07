import org.junit.Test;
import rpsGame.*;

import static org.junit.Assert.assertEquals;

public class RpsTest {
    /**
     * Юнит тест отвечающий за тестирование игры.
     */

    @Test
    public void RPSGameTest() {
        UserMove userMoveTest = new UserMove();
        assertEquals(Type.ROCK, userMoveTest.getUserValue("Камень"));
        Type userTest = userMoveTest.getUserValue("Камень");

        ComputerMove computerMoveTest = new ComputerMove();
        Type computerTest = computerMoveTest.getComputerRandom();
        assertEquals(Type.ROCK, computerMoveTest.getComputerRandom());

        GetWinner gameProcess = new GetWinner();
        System.out.println("Победил = " + gameProcess.getWinner(userTest, computerTest));
        assertEquals(GameSummary.TIE, gameProcess.getWinner(userTest, computerTest));
    }
}


