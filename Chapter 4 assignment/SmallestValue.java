import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n = input.nextInt();
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter an integer: ");
            int value = input.nextInt();
            if (value < smallest)
                smallest = value;
        }
        System.out.println("Smallest value is " + smallest);
    }
}
