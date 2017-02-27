package com.wbl.oops;

public abstract class Ball {
	
	public String ballType="sportsBall";
	public String color;
	public int radius;
	private double weight;
	
	public Ball(){
		System.out.println("abstract class constructor");
	}
	
    public double areaOfBall(){
		return 3.14*radius*radius;
	}
	
	public double weightOfBall(){
		return weight;
	}
	
	
	public  abstract String ballManufacture();
	
	public abstract void bounceCriteria();
	
	

}
