package com.szechuan;

public class Employee extends Person{
	
	private double rate,hour;
	
	public void setHour(double setHour)
	{
		hour = setHour;
	}
	
	public double getHour()
	{
		return hour;
	}
	public void setRate(double setRate)
	{
		rate = setRate;
	}
	
	public double getRate()
	{
		return rate;
	}
	public void paySlip()
	{
		//Hour*Rate
		printHeader();
		//PayCheck Thingies
		double payCheck;
		payCheck = hour * rate;
		//Print stuff about the employee
		System.out.println("Employee Name: " + firstName + " " + lastName);
		System.out.println("The Salary is: " + payCheck);
	}
	public void paySlip(double benefits,double bonus,double tax)
	{
		//Hour*Rate
		printHeader();
		//PayCheck Thingies
		double payCheck;
		payCheck = hour * rate;
		payCheck = payCheck - benefits;
		payCheck = payCheck + bonus;
		payCheck = payCheck - (payCheck * tax);
		//Print stuff about the employee
		System.out.println("Regular Employee Name: " + firstName + " " + lastName);
		System.out.println("The Salary : " + payCheck);

	}
}
