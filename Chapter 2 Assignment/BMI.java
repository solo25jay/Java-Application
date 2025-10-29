import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f%n", bmi);

        System.out.println("BMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: 18.5–24.9");
        System.out.println("Overweight: 25–29.9");
        System.out.println("Obese: 30 or greater");
    }
}
