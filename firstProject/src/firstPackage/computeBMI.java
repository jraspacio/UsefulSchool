package firstPackage;

import java.util.Scanner;


public class computeBMI {
	public static void main(String[] args) 
	{
		/*
		 * Compute BMI
		 * BMI = Weight(kg)/Height^2
		 * Notes:
		 * User input for Height must be in English Metric System
		 * 
		 * Flow ->
		 * 1.Get user info ( Weight and Height using double data type)
		 * 2.Convert English to Metric system for Height
		 * 3.Compute BMI
		 * 4.Output BMI
		 * 
		 * If else conditions
		 * <18.5 == Underweight
		 * >= 18.5 && <=24.9 == Healthy
		 * >= 25 && <=29.9 == Overweight
		 * >= 30 == Obese
		 */
		
		
		//Create a scanner object called userInput
		Scanner userInput = new Scanner(System.in);
		//Create Variables
		double weight, height,BMI;
		
		//Line of Code Start
		
		//Request User weight in Kilos(Metric)
		System.out.print("Enter Weight(KG): ");
		//Store userInput to weight
		weight = userInput.nextDouble();
		//Request User height in Feet(English)
		System.out.print("Enter Height(Ft): ");
		height = userInput.nextDouble();
		//Gotta close the Scanner
		userInput.close();
		
		
		double metreConversion = .3048;
		//Convert Feet to Metre
		height = height * metreConversion;
		//Compute for BMI
		BMI = weight/(height*height);
		//If else conds
		if(BMI < 18.5) //Underweight
		{
			System.out.println("Your BMI is " + BMI);
			System.out.println("Kain ka pa konti! Underweight ka!");
		}
		else if(BMI >= 18.5 && BMI <= 24.9) //Healthy
		{
			System.out.println("Your BMI is " + BMI);
			System.out.println("Healthy c ikaw...");
		}
		else if(BMI >=25 && BMI <= 29.9) //Overweight
		{
			System.out.println("Your BMI is " + BMI);
			System.out.println("Bawas kain ka nak, overweight ka na");
		}
		else if(BMI >= 30) //Obese
		{
			System.out.println("Your BMI is " + BMI);
			System.out.println("Kaka computer yan kaya OBESE ka nak!");
		}
	}
}
