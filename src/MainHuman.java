public class MainHuman {
    public static void main(String[] args) {
        Human first_person = new Human("Разрабов", "Кодер", "Багович", 21);
        System.out.println(first_person.toString());

        Human second_person = new Human();
        System.out.println(second_person.toString());
    }
}
