public class OperatorsPart2{
	public static void main(String[] args){
		int num1 = 30;
		int num2 = 35;
		int num3 = 17;
		
		//AND Logical operator
		boolean result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",result);
		
		//OR Logical operator
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b%n",result2);
		
		//NOT Logical operator
		boolean result3 = !((num1 > num2) && (num1 > num3));
		System.out.printf("The result is %b%n",result3);
		
		//Pre-increment unary operator
		int num4 = 10;
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",++num4);
		
		//Post-increment unary operator
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5++);
		
		//Pre-decreament unary operator
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",--num4);
		
		//Post-decreament unary operator
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5--);
		System.out.printf("%d%n",num5);
	}
}