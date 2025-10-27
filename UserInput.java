import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double bal = 5678.98;
		
		System.out.print("Enter your firstname: ");
		String firstName = input.nextLine();
		
		
		System.out.print("Enter lastname: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter your age:" );
		short age = input.nextShort();
		
		System.out.printf("Welcome %s %s to FirstBank",firstName,lastName);
		System.out.printf("Your are %d years old%n",age);
		System.out.printf("Your account balance is $%.2f%n",bal);
		
		
	}
}