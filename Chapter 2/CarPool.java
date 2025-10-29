import java.util.Scanner;

public class CarPool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles per day: ");
        double miles = input.nextDouble();

        System.out.print("Enter cost per gallon: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double mpg = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parking = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();

        double dailyCost = (miles / mpg) * costPerGallon + parking + tolls;
        System.out.printf("Your daily driving cost is: $%.2f%n", dailyCost);
    }
}
