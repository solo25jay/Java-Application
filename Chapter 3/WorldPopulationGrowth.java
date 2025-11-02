import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (as %): ");
        double growthRate = input.nextDouble() / 100;

        double originalPopulation = population;

        System.out.println("\nYear\tPopulation\tIncrease");
        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;
            System.out.printf("%d\t%.0f\t%.0f%n", year, population, increase);
        }

        int yearToDouble = (int) (Math.log(2) / Math.log(1 + growthRate));
        System.out.printf("%nPopulation will double in approximately %d years.%n", yearToDouble);
        input.close();
    }
}
