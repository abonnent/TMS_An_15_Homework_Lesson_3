public class Exercise02 {
    public static void main(String[] args) {
        // 42 в разных системах счисления
        int binaryVar = 0b101010;
        int octalVar = 052;
        int decimalVar = 42;
        int hexadecimalVar = 0x2A;

        System.out.println("Двоичная система: " + binaryVar);
        System.out.println("Восьмеричная система: " + octalVar);
        System.out.println("Десятичная система: " + decimalVar);
        System.out.println("Шестнадцатиричная система: " + hexadecimalVar);
    }
}