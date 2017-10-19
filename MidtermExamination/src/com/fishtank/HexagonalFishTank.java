package com.fishtank;

import java.util.Scanner;
/**
 * Overrides the FishTank Interface for Hexagonal Prisms.
 * <p>
 * The amount of water should fill 3/4 of the tank and 231 cubic inches in a gallon || 3.79 liters in a gallon
 * Client specifies that cost of water is 13/liter and the cost of the is 1.5/cubic inch
 * 
 * @author 2016SHA01020
 * @version 1.0
 */
public class HexagonalFishTank implements FishTank{
	public double computeVolume(double length, double side, double height)
	{
		double volume;
		volume = 3 * length * side * height;
		return volume;
	}
	public double computeWater()
	{
		Scanner userNumeric = new Scanner(System.in);
		double length = 0,
				side = 0,
				height = 0,
				totalWater = 0,
				rectVolume = 0;
		System.out.println("REQUIRED FOR WATER COMPUTATION (INCHES)");
		System.out.print("Enter length: ");
		length = userNumeric.nextDouble();
		System.out.print("Enter width: ");
		side = userNumeric.nextDouble();
		System.out.print("Enter height: ");
		height = userNumeric.nextDouble();
		//Call compute Volume
		rectVolume = computeVolume(length,side,height);
		//Get Volume
		totalWater = .75 * rectVolume ;
		//Convert Volume to Gallons
		totalWater = totalWater / 231;
		//Convert Gallons to Liters
		totalWater = 3.79 * totalWater;
		userNumeric.close();
		return totalWater;
	}
	public double computeCost()
	{
		Scanner userNumeric = new Scanner(System.in);
		//Variables Here
		double length = 0,
				side = 0,
				height = 0;
		double tankCost = 1.5;
		double waterCost = 13;
		//User Input
		System.out.println("VOLUME OF RECTANGLE (IN INCHES)");
		System.out.print("Enter length: ");
		length = userNumeric.nextDouble();
		System.out.print("Enter width: ");
		side = userNumeric.nextDouble();
		System.out.print("Enter height: ");
		height = userNumeric.nextDouble();
		
		//Vars to be used for calculating
		 double rectVolume = computeVolume(length,side,height);
		 double reqWater = computeWater();
		 double tankTotal = tankCost * rectVolume;
		 double totalWater = waterCost * reqWater;
		 double totalCost = tankTotal + totalWater;
		 userNumeric.close();
		return totalCost;
	}
}
