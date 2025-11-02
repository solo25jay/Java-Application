import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossSales = 0;

        System.out.print("Enter item value sold (-1 to end): ");
        double item = input.nextDouble();

        while (item != -1) {
            grossSales += item;
            System.out.print("Enter next item value sold (-1 to end): ");
            item = input.nextDouble();
        }

        double earnings = 200 + 0.09 * grossSales;
        System.out.printf("Total earnings: $%.2f%n", earnings);
        input.close();
    }
}
