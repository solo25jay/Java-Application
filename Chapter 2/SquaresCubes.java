public class SquaresCubes {
    public static void main(String[] args) {
        System.out.printf("%s\t%s\t%s%n", "Number", "Square", "Cube");
        for (int i = 0; i <= 10; i++)
            System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
    }
}
