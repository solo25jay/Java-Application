import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employee = 1;

        while (employee <= 3) {
            System.out.printf("Enter hours worked for employee %d: ", employee);
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;
            if (hours <= 40)
                grossPay = hours * rate;
            else
                grossPay = 40 * rate + (hours - 40) * rate * 1.5;

            System.out.printf("Gross pay for employee %d: $%.2f%n%n", employee, grossPay);
            employee++;
        }
        input.close();
    }
}
