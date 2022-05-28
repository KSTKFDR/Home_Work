import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void humanTest() {
        Human test = new Human("Негорин", "Негеннадий", "Неалександрович", 50);

        test.setFamily("Горин");
        test.setName("Геннадий");
        test.setSurname("Александрович");
        test.setAge(48);

        assertEquals("Горин", test.getFamily());
        assertEquals("Геннадий", test.getName());
        assertEquals("Александрович", test.getSurname());
        assertEquals(48, test.getAge());

    }

    @Test
    public void toStringTest() {
        Human toStringTest = new Human("Горин", "Геннадий", "Александрович", 48);
        assertEquals("\nКласс Human \nФамилия = Горин,\nИмя = Геннадий\nОтчество = Александрович,\nВозраст = 48", toStringTest.toString());
    }

}