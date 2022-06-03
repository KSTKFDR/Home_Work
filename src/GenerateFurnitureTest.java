import furniture.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Класс с юнит тестом отвечающий за тестирование генератора.
  */


public class GenerateFurnitureTest {

    @Test
    public void FurnitureGenerateTest() {
        Name testFurnitureName = new Name();
        testFurnitureName.setName("АРГО");
        assertEquals("АРГО", testFurnitureName.getName());

        Color testFurnitureColor = new Color();
        testFurnitureColor.setColor("Золотой");
        assertEquals("Золотой", testFurnitureColor.getColor());

        FindType testFurnitureType = new FindType();
        assertEquals(Type.BED, testFurnitureType.searchType("Кровать"));
    }
}