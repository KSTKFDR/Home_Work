public class Human {
    String family;
    String name;
    String surname;
    int age;

    void setFamily(String family) {
        this.family = family;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getFamily() {
        return family;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    public Human() {

    }

    Human(String family, String name, String surname, int age) {
        this.family = family;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        return "\nКласс Human " + "\nФамилия = " + family + "," + "\nИмя = " + name + "\nОтчество = " + surname + "," + "\nВозраст = " + age;
    }

}

