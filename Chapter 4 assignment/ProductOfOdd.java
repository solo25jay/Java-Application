public class ProductOfOdd {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 15; i += 2)
            product *= i;
        System.out.println("Product = " + product);
    }
}
