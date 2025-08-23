import java.util.Scanner;

class Test{
	public static void main(String[] args){
		
        	Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the First number: ");
        	int number1 =  scanner.nextInt();
        	
		System.out.print("Enter the Second number: ");
		int number2 =  scanner.nextInt();

		int sum= number1 + number2;
		int division = number1/ number2;
		int mod = number1%number2;
		int multi = number1*number2;
		
		System.out.println("Sum of an integer is: " + sum);
		System.out.println("Division of an integer is: " + division);
		System.out.println("Modulous of an integer is: " + mod);
		System.out.println("Product of an integer is: " + multi);
		

		}

}