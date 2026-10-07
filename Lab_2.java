import java.util.Scanner;

public class Lab_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
           System.out.println("Число является четным."); // Проверка четности
        } else {
            System.out.println("Число является нечетным.");
        }

        System.out.print("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Максимальное число: " + max);

        scanner.close();
    }
}