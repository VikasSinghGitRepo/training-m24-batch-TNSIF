package com.cg.inheritance;

public class CONSTRUCTOR_IN_INHERITANCE {
	  public int cadence;
	  public int gear;
	  public int speed;
	  
	  public CONSTRUCTOR_IN_INHERITANCE(int startCadence, int startSpeed, int startGear) {
	        gear = startGear;
	        cadence = startCadence;
	        speed = startSpeed;
	    }
	  
	  public void setCadence(int newValue) {
	        cadence = newValue;
	    }
	        
	    public void setGear(int newValue) {
	        gear = newValue;
	    }
	        
	    public void applyBrake(int decrement) {
	        speed -= decrement;
	    }
	        
	    public void speedUp(int increment) {
	        speed += increment;
	    }
	      	    
}

class Base extends CONSTRUCTOR_IN_INHERITANCE{
	public int seatHeight;

	 public Base(int startHeight,
             int startCadence,
             int startSpeed,
             int startGear) {
		 	 super(startCadence, startSpeed, startGear);
		 	 seatHeight = startHeight;
		 	
}
	 public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }   
	 
}
