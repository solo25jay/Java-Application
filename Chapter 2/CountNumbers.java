import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pos = 0, neg = 0, zero = 0;

        for (int i = 1; i <= 5; i++) {
            int n = input.nextInt();
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else zero++;
        }

        System.out.printf("Positives: %d%nNegatives: %d%nZeros: %d%n", pos, neg, zero);
    }
}
