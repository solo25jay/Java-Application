import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("Enter number %d: ", counter);
            int number = input.nextInt();

            if (number > largest)
                largest = number;

            counter++;
        }

        System.out.printf("The largest number is: %d%n", largest);
        input.close();
    }
}
