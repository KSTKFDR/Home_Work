import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void getGenerateAnagramTest() {
        Anagram test = new Anagram("Привет");
        assertEquals("тривеП", test.generateAnagram("Привет"));
    }

}




