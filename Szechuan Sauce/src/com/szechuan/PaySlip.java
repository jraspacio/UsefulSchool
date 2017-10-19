/**
 * 
 */
package com.szechuan;

import java.util.Scanner;

/**
 * @author 2016SHA01020
 *
 */
public class PaySlip {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Declare Variables to be used
		String name;
		double rate,hour,allowance,day,benefits,tax,bonus;
		// MENU SECTION
		System.out.println("Welcome Slave to /r/CorporateSlave!");
		System.out.println("Choose your type of enslavement: ");
		System.out.println("Enter 1 for EMPLOYEE");
		System.out.println("Enter 2 for STUDENT");
		System.out.println("Enter 3 for REGULAR EMPLOYEE");
		//Create a scanner object called userInput
		Scanner userInputString = new Scanner(System.in);
		Scanner userInputNumeric = new Scanner(System.in);
		//Flow Control for Student or Employee
		System.out.print("Choice: ");
		int userSelection;
		
		userSelection = userInputNumeric.nextInt();
		//Flow for Employee
		if(userSelection == 1)
			{
				//Employee Object
				Employee e = new Employee();
				//First Name
				System.out.print("Enter First Name: ");
				name = userInputString.next();
				e.setFirstName(name);
				//Last Name
				System.out.print("Enter Last Name: ");
				name = userInputString.next();
				e.setLastName(name);
				//Rate
				System.out.print("Enter Pay Rate: ");
				rate = userInputNumeric.nextDouble();
				e.setRate(rate);
				//Hour
				System.out.print("Enter Hours Worked: ");
				hour = userInputNumeric.nextDouble();
				e.setHour(hour);
				
				e.paySlip();
			}
		//Else is for Student
		else if(userSelection == 2)
			{
				//Student Object
				Student s = new Student();
				//First Name
				System.out.print("Enter First Name: ");
				name = userInputString.next();
				s.setFirstName(name);
				//Last Name
				System.out.print("Enter Last Name: ");
				name = userInputString.next();
				s.setLastName(name);
				//Student Allowance
				System.out.print("Enter Allowance: ");
				allowance = userInputNumeric.nextDouble();
				s.setAllowance(allowance);
				//Student Days
				System.out.print("Enter Hours Worked: ");
				day = userInputNumeric.nextDouble();
				s.setDay(day);
				
				s.paySlip();
			}
		else if(userSelection == 3)
			{
				//Employee Object
				Employee e = new Employee();
				//First Name
				System.out.print("Enter First Name: ");
				name = userInputString.next();
				e.setFirstName(name);
				//Last Name
				System.out.print("Enter Last Name: ");
				name = userInputString.next();
				e.setLastName(name);
				//Rate
				System.out.print("Enter Pay Rate: ");
				rate = userInputNumeric.nextDouble();
				e.setRate(rate);
				//Hour
				System.out.print("Enter Hours Worked: ");
				hour = userInputNumeric.nextDouble();
				e.setHour(hour);
				//Benefits, Bonuses, Taxes
				System.out.print("Regular Employee Benefits: ");
				benefits = userInputNumeric.nextDouble();
				System.out.print("Regular Employee Bonus: ");
				bonus = userInputNumeric.nextDouble();
				System.out.print("Regular Employee Tax");
				tax = userInputNumeric.nextDouble();
				//Calculator
				e.paySlip(benefits,bonus,tax);
			}
		userInputString.close();
		userInputNumeric.close();
	}

}
