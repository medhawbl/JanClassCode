package com.wbl.oops;

public class CricketBall extends Ball {
	
	public CricketBall(){
		System.out.println("cricket ball constructor");
	}
	

	public  String ballManufacture(){
		String sportType = ballType;
		System.out.println("Cricket ball");
		return sportType;
	}
	
	public  void bounceCriteria(){
		System.out.println("Bounce criteria cricketball- high");
	}
	
	
	
	 
}
