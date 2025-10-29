import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double rate = input.nextDouble() / 100;

        for (int year = 1; year <= 5; year++) {
            population += population * rate;
            System.out.printf("Year %d: %.0f%n", year, population);
        }
    }
}
