import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        System.out.printf("Sum: %d%nProduct: %d%nDifference: %d%nQuotient: %d%n",
                a + b, a * b, a - b, a / b);
    }
}
