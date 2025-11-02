import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to quit): ");
        int account = input.nextInt();

        while (account != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;
            System.out.printf("New balance: %d%n", newBalance);

            if (newBalance > creditLimit)
                System.out.println("Credit limit exceeded\n");

            System.out.print("Enter account number (or -1 to quit): ");
            account = input.nextInt();
        }
        input.close();
    }
}
