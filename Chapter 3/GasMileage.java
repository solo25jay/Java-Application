import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons;
        double totalMiles = 0, totalGallons = 0;

        System.out.print("Enter miles driven (-1 to end): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallons;
            System.out.printf("Combined miles per gallon: %.2f%n%n", totalMiles / totalGallons);

            System.out.print("Enter miles driven (-1 to end): ");
            miles = input.nextInt();
        }
        input.close();
    }
}
