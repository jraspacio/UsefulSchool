package com.fishtank;
/**
 * This is the interface to be used as basis for the FishTankHelper midterm exam.
 * Note that the classes should have only two attributes: WATER and VOLUME. 
 * There is NO need to create additional getter and setter methods for these. 
 * @author User
 *
 */
public interface FishTank {
	
	/**
	 *  This method computes the volume of the fish tank based on the given parameters.
	 * @param length length of the tank in inches
	 * @param side side of the tank in inches
	 * @param height height of the tank in inches
	 * @return volume of the fish tank
	 */
	public double computeVolume(double length, double side, double height);
	
	/**
	 * This method computes the amount of water needed to fill 3/4 of the tank based
	 * on its volume.
	 * @return amount of water in liters
	 */
	public double computeWater();
	
	/**
	 * This method computes the total cost of the tank and water.
	 * @return total cost of the fish tank order
	 */	
	public double computeCost();
}
