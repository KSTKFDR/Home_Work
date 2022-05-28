import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookTest() {
        Book test = new Book("Вы тоже хотите кушац?", 359, 2022, "Горин Г");
        test.setName("А что вы делаете в моем холодильнике?");
        test.setTotal_pages(100);
        test.setRelease_year(2021);
        test.setWriter("Горин Г");

        assertEquals("А что вы делаете в моем холодильнике?", test.getName());
        assertEquals(100, test.getTotal_pages());
        assertEquals(2021, test.getRelease_year());
        assertEquals("Горин Г", test.getWriter());

    }

}