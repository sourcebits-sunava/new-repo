package com.sourcebits.areacalculater.model;

public class Square implements Shape
{
	final double side;
	public Square(double side)
	{
		this.side = side;
	}
	public double shape()
	{
		return side*side;
	}

}
