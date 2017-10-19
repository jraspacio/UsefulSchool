import java.util.Scanner;

/**
 * This safely handles all the basic input required by any console program.
 * @author CraftedGaming
 *
 */
public class InputHandler {
	// scan_num takes input from numbers
	// scan_text takes input from strings and char
	private static Scanner scan_num = null, scan_text = null;
	
	/**
	 * Checks if the scanner is null. If it is, create a new scanner object.
	 */
	public InputHandler() {
		if(scan_num == null && scan_text == null ) {
			scan_num = new Scanner(System.in);
			scan_text = new Scanner(System.in);
		}
	}
	/**
	 * Ask the user to enter a number. The function checks if the user entered the correct value otherwise it will
	 * print an error message. It will ask the user to enter another input up until the user enters the correct
	 * value
	 * 
	 * @return the number of the input
	 */
	public int n_Int() {
	    System.out.println("Enter a number: ");
	    while (!scan_num.hasNextInt()) {
	        System.out.println("Error: That's not a number!");
	        // to clear the scanner from invalid input
	        scan_num.next(); 
	    }
		return scan_num.nextInt();
	}
	
	/**
	 * Asks the user to enter a string value
	 * 
	 * @return a string value inputed by the user
	 */
	public String n_String() {
		System.out.println("Enter a string: ");
		return scan_text.next();
	}
	
	/**
	 * Asks the user to enter a string value with a specified string.
	 * 
	 * @param the phrase that will replace "a string: " from "Enter a string: "
	 * @return a string value inputed by the user
	 */
	public String n_String(String specified_string) {
		if(specified_string !=null && !specified_string.trim().isEmpty()) {
			System.out.println("Enter " + specified_string + ": ");
		}
		else {
			System.out.println("Enter a string: ");
		}
		return scan_text.next();
	}
	
	/**
	 * Asks the user to enter a character value
	 * 
	 * @return a character value inputed by the user
	 */
	public char n_Char() {
		System.out.println("Enter a character: ");
		return scan_text.findInLine(".").charAt(0);
	}
	
	/**
	 * Asks the user to enter a character value with a specified string.
	 * 
	 * @param the phrase that will replace "a character: " from "Enter a character: "
	 * @return a character value inputed by the user
	 */
	public char n_Char(String specified_string) {
		if(specified_string !=null && !specified_string.trim().isEmpty()) {
			System.out.println("Enter " + specified_string + ": ");
		}
		else {
			System.out.println("Enter a character: ");
		}
		return scan_text.findInLine(".").charAt(0);
	}
	
	public static void main(String[] args) {
		InputHandler a = new InputHandler();
		System.out.println(a.n_Char());
	}

}
