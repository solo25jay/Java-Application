public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;

        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("Interest Rate: %.0f%%%n", rate * 100);
            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}
