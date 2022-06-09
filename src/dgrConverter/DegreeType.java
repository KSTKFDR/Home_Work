package dgrConverter;

/**
 * Класс отвечающий за хранение доступных величин измерений температур
 *
 * @params FAHRENHEIT - градусы по Фаренгейту
 * @params CELSIUS - градусы по Цельсию
 *
 */
public enum DegreeType {
    FAHRENHEIT("F"),
    CELSIUS("C"),
    UNKNOWN("Неизвестная величина");

    private String degreeValue;

    DegreeType(String degreeValue) {
        this.degreeValue = degreeValue;
    }

    private String getDegreeValue() {
        return degreeValue;
    }

    /**
     * Метод отвечающий за определение значения величины измерения температуры исходя из пользовательского ввода
     *
     */

   protected static DegreeType getUserValueDegree(String userValueDegree) {
        for (DegreeType degreeType : values ()) {
            if (degreeType.getDegreeValue().equalsIgnoreCase(userValueDegree)) {
                return degreeType;
            }
        }
        return UNKNOWN;
    }

}



