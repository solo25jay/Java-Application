import java.util.Scanner; 

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int c, thisIsAVariable, q76354, number;

        System.out.print("Enter an integer: ");
        int value = input.nextInt(); 

        System.out.println("This is a Java program");

        System.out.printf("%s%n%s%n", "This is a", "Java program");

        System.out.print("Enter another number: ");
        number = input.nextInt(); 

        if (number != 7)
            System.out.println("The variable number is not equal to 7");
        else
            System.out.println("The variable number is equal to 7");

        input.close(); 
    }
}
