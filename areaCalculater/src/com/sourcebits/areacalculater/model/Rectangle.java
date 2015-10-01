package com.sourcebits.areacalculater.model;

public class Rectangle implements Shape
{
	final double length,breadth;
	public Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double shape()
	{
		return length*breadth;
	}
}
