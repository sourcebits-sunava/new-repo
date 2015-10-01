package com.sourcebits.areacalculater.model;

public class Circle implements Shape
{
	final double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double shape()
	{
		return (.314*radius*radius);
	}

}
