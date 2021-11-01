package com.association;

public class Car {
	
	public String color;
	public int speed;
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void carDetails()
	{
		System.out.println("The color of the car is "+color+" and the speed is "+speed);
	}

}
