package com.work1;
/**
 * Shape is an abstract class.
 * <p>
 * Shape by default contains Area and Perimeter and has a constructor.
 * @author 2016SHA01020
 * @version 1.0
 * @since 9-13-2017
 */
public abstract class Shape {
	String name;
	
	/**
	 * This is the shape constructor.
	 */
	public Shape()
	{
		name = " ";
	}
	/**
	 * Abstract method of computeArea.
	 */
	public abstract void computeArea();
	/**
	 * Abstract method of computePerimeter();
	 */
	public abstract void computePerimeter();
	
	
}
