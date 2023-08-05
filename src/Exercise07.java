import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = console.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = console.nextInt();

        int result = gcd(num1, num2);
        System.out.println("НОД " + num1 + " и " + num2 + " равен " + result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
