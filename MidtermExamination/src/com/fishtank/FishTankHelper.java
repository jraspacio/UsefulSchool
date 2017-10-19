package com.fishtank;

import java.util.Scanner;

/**
 * Main Class File for Fish Tank.
 * <p>
 * Contains the block of code that is required to run the program.
 * Currently Missing Loop function to continue Running.
 * 
 * @author 2016SHA01020
 * @version 1.0
 */
public class FishTankHelper {
	public static void main (String args [])
	{
		//Create Objects
		RectangularFishTank  rectFish = new RectangularFishTank();
		HexagonalFishTank hexFish = new HexagonalFishTank();
		Scanner userNumeric = new Scanner(System.in);
		//Main menu
		int userInput = 0;
		System.out.println("!!FISH HELPER!!");
		System.out.println("1 For Rectangular Tank || 2 For Hexagonal Tank");
		System.out.print("Choice: ");
		
		userInput = userNumeric.nextInt();
		
		//Scenario for Rectangular Prism
		if(userInput == 1)
		{
			System.out.println("==Rectangular Tank==");
			System.out.println("1 For Required Water || 2 for Total Cost");
			System.out.print("Choice: ");
			userInput = userNumeric.nextInt();
			//Compute Water
				if(userInput == 1)
				{
					double water = rectFish.computeWater();
					
					System.out.println("Required 3/4 water(Liters) : " + water);
				}
				//Compute Cost
				else if(userInput == 2)
				{
					double cost = rectFish.computeCost();
					System.out.println("Total Cost: " + cost);
				}
				//Fail
				else
					System.out.print("Invalid Choice! Exiting Now!");
		}
		//Scenario for Hexagonal Prism
		else if (userInput == 2)
		{
			//Compute Water
			if(userInput == 1)
			{
				double water = hexFish.computeWater();
				
				System.out.println("Required 3/4 water(Liters) : " + water);
			}
			//Compute Cost
			else if(userInput == 2)
			{
				double cost = hexFish.computeCost();
				System.out.println("Total Cost: " + cost);
			}
			//Fail
			else
				System.out.print("Invalid Choice! Exiting Now!");
		}
		else
			System.out.println("Invalid Choice. Exiting Program");
		
		userNumeric.close();
	}
}
