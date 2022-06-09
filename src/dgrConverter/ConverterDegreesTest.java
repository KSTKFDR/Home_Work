package dgrConverter;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterDegreesTest {

    @Test
    private void ConverterDegreesTest() {
        UserValue userNumberDegree = new UserValue(20);
        assertEquals(20,userNumberDegree.getUserValue());
        int degree = userNumberDegree.getUserValue();

        DegreeType degreeConvertType = DegreeType.getUserValueDegree("C");
        assertEquals(DegreeType.CELSIUS, degreeConvertType.getUserValueDegree("C"));

       int convert = ConverterDegrees.convert(degree, degreeConvertType);
       assertEquals( -6,convert);

    }

}


