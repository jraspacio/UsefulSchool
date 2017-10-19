package com.work1;
import java.util.Scanner;

/**
 * Square inherits abstract class shape and contains the main method of this project.
 * <p>
 * Square contains the functions for computing the Area and Perimeter of a square. This also contains the main method
 * of the project. We also import the Scanner Class for user input.
 * 
 * @author 2016SHA01020
 * @version 1.0
 * @since 9-13-2017
 */
public class Square extends Shape{
	/**
	 * This computes the AREA of a square.
	 * <p>
	 * The function creates a Scanner in order for the user input the square's height and width.
	 */
	public void computeArea()
	{
		Scanner userNumeric = new Scanner(System.in);
		
		float xheight,xwidth,area;
		
		System.out.print("Enter Square's height: ");
		xheight = userNumeric.nextFloat();
		System.out.print("Enter Square's width: ");
		xwidth = userNumeric.nextFloat();
		
		area = xheight * xwidth;
		
		System.out.println("The Square's Area is " + area);
		
		userNumeric.close();
	}
	/**
	 * This computes the PERIMETER of a square.
	 * <p>
	 * The function creates a Scanner in order for the user input the square's height and width.
	 */
	public void computePerimeter()
	{
		Scanner userNumeric = new Scanner(System.in);
		
		float xSide,xPerimeter;
		
		System.out.print("Enter length of the side: ");
		xSide = userNumeric.nextFloat();
		
		xPerimeter = 4 * xSide;
		
		System.out.println("The Square's Perimeter is " + xPerimeter);
		
		userNumeric.close();
	}
	/**
	 * This is the main method of the class.
	 * <p>
	 * Self-Explanatory LOL
	 */
	public static void main(String[] args) {
		Scanner userNumeric = new Scanner(System.in);
		Square boi = new Square();
		
		int choice;
		
		System.out.println("MAGICAL PROGRAM THAT FIXES YOUR PROBLEMS WITH SQUARES");
		System.out.println("TOTALLY NOT A SCAM OR NETWORKING SCAM!!! LEARN HERE");
		System.out.println("Enter 1 for AREA ||| Enter 2 for PERIMETER");
		
		System.out.print("INPUT: ");
		choice = userNumeric.nextInt();
		
		if(choice == 1)
		{
			boi.computeArea();
		}
		else if (choice == 2)
		{
			boi.computePerimeter();
		}
		else
		{
			System.out.println("Invalid input. Closing Program!!!!!!");
		}
		userNumeric.close();
	}
	
}
