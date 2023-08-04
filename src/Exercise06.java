import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        System.out.println("Введённое слово: \"" + word + "\"");
    }
}