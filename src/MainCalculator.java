public class MainCalculator {
    public static void main(String[] args) {
        Calculator operation = new Calculator();

        System.out.println("Сложение = " + operation.addition(3, 3));
        System.out.println("Умножение = " + operation.multiplication(3, 3));
        System.out.println("Вычитание = " + operation.subtraction(3, 3));
        System.out.println("Деление = " + operation.divide(3, 3));

    }
}
