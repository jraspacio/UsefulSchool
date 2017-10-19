/**
 * This Class contains the requirements for the Receiver Label.
 * <p>
 * This current
 * 
 * @author Marcelo Magday
 * @version 1.0
 */
package com.Labels;
import java.util.Date;
public class ReceiverLabel extends Label{
	
	String currentDate;
	
	/**
	* Class function that gets the current date using the date package.
	* <p>
	* The current date is retrieved using the Date package. You may use this function when you call print instead of running it 
	* in the main method of the program.
	* 
	* @return	This method does not return any value.
	*/
	public void setCurrentDate()
	{
	     Date date = new Date();
	     currentDate = date.toString();
	}
	/**
	* Class function that returns the current date.
	*<p>
	*This damn thing is self explanatory sheesh.
	*
	* @return	the Current Date of the user.
	*/
	public String getCurrentDate()
	{
		return currentDate;
	}
	/**
	* Class function that prints the current date.
	* <p>
	* This damn thing is self explanatory sheesh.
	* 
	* @return	This method does not return any value.
	*/
	public void printCurrentDate()
	{
		System.out.println(currentDate);
	}
	/**
	* Class function that prints the label.
	* <p>
	* printLabel is inherited from the Label Class and this method does not contain the parameter for special arguements.
	* The data is gathered via the set methods in this class. 
	* 
	* @return	This method does not return any value.
	*/
	public void printLabel()
	{
		setCurrentDate();
		System.out.println(" 	!!!RECEIVER INFORMATION FILLED!!!");
		System.out.println("Receiver Name: " + name);
		System.out.println("Receiver Address + address");
		System.out.println("Current Date: " + currentDate);
	}
	/**
	* Class function that prints the label that has special instructions.
	* 
	* @param Instructions the special instructions for the delivery
	* @return	This method does not return any value.
	*/
	public void printLabel(String Instructions)
	{
		setCurrentDate();
		System.out.println(" 	!!!RECEIVER INFORMATION FILLED!!!");
		System.out.println("Receiver Name: " + name);
		System.out.println("Receiver Address + address");
		System.out.println("Current Date: " + currentDate);
		System.out.println("Special Instructions: " + Instructions);
	}
}
