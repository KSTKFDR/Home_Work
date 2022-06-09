package dgrConverter;

import java.util.Scanner;

public class MainConverterDegrees {
    public static void main(String[] args) {

        System.out.println("Это конвертер градусов. Введите количество градусов и единицу измерения. Например: 20 С, в ответ вы получите 68 F ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество градусов");
        int userValue = scanner.nextInt();
        UserValue userNumberDegree = new UserValue(userValue);
        int degree = userNumberDegree.getUserValue();

        System.out.println("Введите единицу измерения");
        String userValueDegree = scanner.next();
        DegreeType degreeConvertType = DegreeType.getUserValueDegree(userValueDegree);

        System.out.println("Происходит магия конвертирования");
        int convert = ConverterDegrees.convert(degree, degreeConvertType);

        System.out.println("Ваш результат " + convert + " градусов " + degreeConvertType);

    }

}
