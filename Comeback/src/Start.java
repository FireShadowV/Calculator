import java.util.Scanner;
import java.math.BigDecimal;


public class Start {
	public static void main(String args[]) {
		
		
		int OperationNumber;
		
		do {
		
		Scanner reader = new Scanner(System.in);	
		System.out.println("Type a number to choose the operation : 1. Optelllen  2. Aftrekken  3. Vermenigvuldigen  4. Delen 5. Eind");
		OperationNumber = reader.nextInt();
		
		switch(OperationNumber) {
		case 1:
			System.out.println("Enter the first number: ");
		    double myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber2 = reader.nextInt();
			double result1 = myNumber + myNumber2;
			System.out.println("The result is: " + result1);
			break;
		case 2:
			System.out.println("Enter the first number: ");
			double myNumber3 = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber4 = reader.nextInt();
			double result2 = myNumber3 - myNumber4;
			System.out.println("The result is: " + result2);
			break;
		case 3:
			System.out.println("Enter the first number: ");
			double myNumber5 = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber6 = reader.nextInt();
			double result3 = myNumber5 * myNumber6;
			System.out.println("The result is: " + result3);
			break;
		case 4:
			System.out.println("Enter the first number: ");
			double myNumber7 = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber8 = reader.nextInt();
			double result4 = myNumber7 / myNumber8;
			System.out.println("The result is: " + result4);
			break;
		case 5:
			break;
		default:
			System.out.println("Nah fam, You gotta choose a number between 1 and 5;");
			break;
		
		}
		
		
		
		
		
		
		/*OLD CODE
		 *VERSION 1 
		 * 
		 * 
		 * 
		 * if(OperationNumber == 1) {
			System.out.println("Enter the first number: ");
		    double myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber2 = reader.nextInt();
			double result = myNumber + myNumber2;
			System.out.println("The result is: " + result);
			
			
		} else if (OperationNumber == 2) {
			System.out.println("Enter the first number: ");
			double myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber2 = reader.nextInt();
			double result = myNumber - myNumber2;
			System.out.println("The result is: " + result);
			
			
		} else if (OperationNumber == 3) {
			System.out.println("Enter the first number: ");
			double myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber2 = reader.nextInt();
			double result = myNumber * myNumber2;
			System.out.println("The result is: " + result);
			
			
		}else if (OperationNumber == 4) {
			System.out.println("Enter the first number: ");
			double myNumber = reader.nextInt();
			System.out.println("Enter the second number: ");
			double myNumber2 = reader.nextInt();
			double result = myNumber / myNumber2;
			System.out.println("The result is: " + result);
			
			
		} */
		
		}while(OperationNumber != 5);
		
		
		
		
	}
}
