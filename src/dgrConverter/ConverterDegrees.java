package dgrConverter;

/**
 * Класс отвечающий за конвертацию из Фаренгейта в цельсии и наоборот
 *
 * @params convertToF - результат конвертирования из C в F
 * @params convertToC - результат конвертирования из F в C
 */

public class ConverterDegrees {

    protected static int convert(int degree , DegreeType degreeConvertType) {

        if (degreeConvertType.equals(DegreeType.FAHRENHEIT)) {
           int convertToC = (int) (degree  * 1.8 + 32);
            return convertToC;

        } else if (degreeConvertType.equals(DegreeType.CELSIUS)) {
            int convertToF = (int) ((degree  - 32) / 1.8);
            return convertToF;

        } else if (degreeConvertType.equals(DegreeType.UNKNOWN)) {
            System.out.println("Вы ввели неверную единицу измерения");
        }
        return degree ;
    }
}