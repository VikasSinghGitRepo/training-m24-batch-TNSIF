package com.cg.inheritance;

public class OBJECT_CASTING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Object is super class of almost every class in java 
		//implicit casting
		Object obj = new OBJECT_CASTING();
		
		
		//explicit casting
		//This cast inserts a runtime check that obj is assigned a MountainBike 
		//so that the compiler can safely assume that obj is a MountainBike
		
		//OBJECT_CASTING o= obj; -- will give error
		OBJECT_CASTING o= (OBJECT_CASTING) obj;
		
		
		//to save it from runtime exception in line 18
		if (o instanceof OBJECT_CASTING) {
			OBJECT_CASTING o1= (OBJECT_CASTING) obj; 
		}
		

	}

}
