package com.szechuan;

public class Person {

	/**
	 * @param args
	 */
	protected String firstName,lastName;
	
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void printHeader()
	{
		System.out.println(" _____              _                        ___  ___     _        "); 
		System.out.println("/  ___|            | |                       |  \\/  |    | |       ");
		System.out.println("\\ `--. _______  ___| |__  _   _  __ _ _ __   | .  . | ___| |_ __ _ ");
		System.out.println(" `--. \\_  / _ \\/ __| '_ \\| | | |/ _` | '_ \\  | |\\/| |/ _ \\ __/ _` |");
		System.out.println("/\\__/ // /  __/ (__| | | | |_| | (_| | | | | | |  | |  __/ || (_| |");
		System.out.println("\\____//___\\___|\\___|_| |_|\\__,_|\\__,_|_| |_| \\_|  |_/\\___|\\__\\__,_|");
	}
	
	public void paySlip()
	{
		printHeader();
		
	}
}
