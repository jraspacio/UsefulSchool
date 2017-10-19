package com.Labels;

import java.util.Scanner;

public class LabelPrinter {

	/**
	 * Main Method of the program.
	 */
	public static void main(String[] args) {
		/*
		 * Needed Classes are created here.
		 */
		ReceiverLabel rLabel = new ReceiverLabel();
		SenderLabel sLabel = new SenderLabel();
		Scanner userInputString = new Scanner(System.in);
		Scanner userInputNumeric = new Scanner(System.in);
		/*
		 * Needed Variable/s are created here.
		 */
		String userInput;
		int userChoice;
		/*
		 * Cheaply made Splash Screen
		 */
		System.out.println("	!=LBC LABELER PROGRAM=!");
		System.out.println("	Sender Information Sheet");
		/*
		 * This block contains the process of getting the Sender's Information.
		 */
		System.out.print("Sender Name: ");
		userInput = userInputString.next();
		sLabel.setName(userInput);
		
		System.out.print("Sender Address: ");
		userInput = userInputString.next();
		sLabel.setAdress(userInput);
		
		//Clear Screen the cheap way
		for(int clear = 0; clear < 1000; clear++) {
		    System.out.println(" ") ;
		}
		/*
		 * This block contains the process of getting the Receiver's Information.
		 */
		//Shows what to fill up
		System.out.println("	Receiver Information Sheet");
		
		rLabel.getCurrentDate();
		
		System.out.print("Receiver Name: ");
		userInput = userInputString.next();
		rLabel.setName(userInput);
		
		System.out.print("Receiver Address: ");
		userInput = userInputString.next();
		rLabel.setAdress(userInput);
		
		System.out.println("Are there any Special Instructions?");
		System.out.println("Enter '1' for YES, else Enter '2' for NO");
		userChoice = userInputNumeric.nextInt();
		//System.out.println(userInput);
		
		if(userChoice == 1)
		{
			System.out.print("Special Delivery Instructions: ");
			userInput = userInputString.next();
			//Clear Screen the cheap way
			for(int clear = 0; clear < 1000; clear++) {
			    System.out.println(" ") ;
			}
			
			sLabel.printLabel();
			rLabel.printLabel(userInput);
		}
		
		else
		{
			sLabel.printLabel();
			rLabel.printLabel();
		}

		userInputString.close();
		userInputNumeric.close();
	}

}
