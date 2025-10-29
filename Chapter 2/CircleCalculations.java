import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter circle radius: ");
        int radius = input.nextInt();
        
        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %f%n", 2 * Math.PI * radius);
        System.out.printf("Area: %f%n", Math.PI * radius * radius);
    }
}