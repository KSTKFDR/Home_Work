import org.junit.Test;
import rpsGame.*;
import static org.junit.Assert.assertEquals;

/**
 * Класс с юнит тестом отвечающий за тестирование игры.
 */
public class RPSTest {

    @Test
    public void RPSGameTest() {
        UserMove userMoveTest = new UserMove("Камень");
        assertEquals(Type.ROCK, userMoveTest.setUserValue("Камень"));

        ComputerMove computerMoveTest = new ComputerMove();
        assertEquals(Type.ROCK, computerMoveTest.getComputerRandom());

        GetWinner gameProcess = new GetWinner();
        System.out.println("Победил = " + gameProcess.GetWinner(userMoveTest,computerMoveTest));
    }
}


