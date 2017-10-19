package firstPackage;
import	java.util.Scanner;

public class FirstClass {

	/**
	 * First Java Program in Class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print out Keel me
		System.out.println("KEEL ME");
		//Create a scanner object called userInput
		Scanner userInput = new Scanner(System.in);
		//Print out Your Name
		System.out.println("Kimi No Nawa: ");
		//name gets input fron userInput object
		String name = userInput.nextLine();
		//print out KYS and the userInput name
		System.out.println("Kill yourself " + name);
		//Gotta close the Scanner
		userInput.close();
	}

}
