import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    @Test
    public void MovieTest() {
        Movie movieTest = new Movie("Кулинарное шоу `База кормит", 140, "Станислав Аскет");
        movieTest.setName("Чем питаться без гастролей");
        movieTest.setTotal_min(10);
        movieTest.setDirector("Макаревич А");

        assertEquals("Чем питаться без гастролей", movieTest.getName());
        assertEquals(10, movieTest.getTotal_min());
        assertEquals("Макаревич А", movieTest.getDirector());
    }
}