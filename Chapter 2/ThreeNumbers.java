import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter three integers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
        int average = sum / 3;

        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));

        System.out.printf("Sum = %d%nAverage = %d%nProduct = %d%nSmallest = %d%nLargest = %d%n",
                sum, average, product, smallest, largest);
    }
}
