public class StarsPattern {
    public static void main(String[] args) {
        // Pattern 1
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println(); // blank line for spacing

        // Pattern 2
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("**");
        System.out.println(); // blank line for spacing

        // Pattern 3 - all in one line
        System.out.print("**************");
        System.out.println(); // move to next line

        // Pattern 4
        System.out.print("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.print("****");
        System.out.println("**");
        System.out.println(); // blank line for spacing

        // Pattern 5
        System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
    }
}
