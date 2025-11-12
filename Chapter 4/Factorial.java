public class Factorial {
    public static void main(String[] args) {
        System.out.printf("%-5s%-20s%n", "n", "n!");
        for (int n = 1; n <= 20; n++) {
            long fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            System.out.printf("%-5d%-20d%n", n, fact);
        }
    }
}
