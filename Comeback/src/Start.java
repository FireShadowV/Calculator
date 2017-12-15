import java.util.Scanner;

public class Start {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a number to choose the operation : 1. Optelllen  2. Aftrekken  3. Vermenigvuldigen  4. Delen 5. Eind");
		int OperationNumber = reader.nextInt();
		
		
		
		
		if(OperationNumber == 1) {
			System.out.println("Enter the first number: ");
			int myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			int myNumber2 = reader.nextInt();
			int result = myNumber + myNumber2;
			System.out.println("The result is: " + result);
			
			
		} else if (OperationNumber == 2) {
			System.out.println("Enter the first number: ");
			int myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			int myNumber2 = reader.nextInt();
			int result = myNumber - myNumber2;
			System.out.println("The result is: " + result);
			
			
		} else if (OperationNumber == 3) {
			System.out.println("Enter the first number: ");
			int myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			int myNumber2 = reader.nextInt();
			int result = myNumber * myNumber2;
			System.out.println("The result is: " + result);
			
			
		}else if (OperationNumber == 4) {
			System.out.println("Enter the first number: ");
			int myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			int myNumber2 = reader.nextInt();
			int result = myNumber / myNumber2;
			System.out.println("The result is: " + result);
			
			
		} else {
			System.out.println("You failed a basic question");
			
		
		
		}
		
		
		
		
		
		
	}
}
