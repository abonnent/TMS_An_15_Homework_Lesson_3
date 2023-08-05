import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Внесите свой вклад: ");
        double deposit = console.nextDouble();

        System.out.print("Укажите срок вклада: ");
        int year = console.nextInt();

        double sum = 0;
        for (int i = 0; i < year; i++) {
            sum = deposit * 1.1;
            deposit = sum;
        }

        System.out.println("За " + year + " год(а) Ваш доход составит " + sum);
    }
}
