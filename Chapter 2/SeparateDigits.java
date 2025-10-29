import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.printf("%d   %d   %d   %d   %d%n",
                number / 10000,
                (number / 1000) % 10,
                (number / 100) % 10,
                (number / 10) % 10,
                number % 10);
    }
}
