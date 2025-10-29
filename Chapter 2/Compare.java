import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first integer: ");
        a = input.nextInt();
        System.out.print("Enter second integer: ");
        b = input.nextInt();

        if (a > b)
            System.out.printf("%d is larger%n", a);
        else if (b > a)
            System.out.printf("%d is larger%n", b);
        else
            System.out.println("These numbers are equal");
    }
}
