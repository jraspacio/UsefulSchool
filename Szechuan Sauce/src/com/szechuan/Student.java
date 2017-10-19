package com.szechuan;

public class Student extends Person{
	
	private double allowance,day;
	
	public void setAllowance(double setAllowance)
	{
		allowance = setAllowance;
	}
	
	public double getAllowance()
	{
		return allowance;
	}
	public void setDay(double setDay)
	{
		day = setDay;
	}
	
	public double getDay()
	{
		return day;
	}
	public void paySlip()
	{
		//Day * Allowance
		printHeader();
		//Things for PayCheck stuff
		double payCheck;
		payCheck = allowance * day;
		//Print Info on Student
		System.out.println("Student Name: " + firstName + " " + lastName);
		System.out.println("The Student's allowance is: " + payCheck);
	}
}
