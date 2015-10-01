package com.sourcebits.areacalculater.model;

public class Triangle implements Shape
{
	final double height,base;
	public Triangle(double height,double base)
	{
		this.height = height;
		this.base = base;
	}
	public double shape()
	{
		return .5*base*height;
	}	
}
