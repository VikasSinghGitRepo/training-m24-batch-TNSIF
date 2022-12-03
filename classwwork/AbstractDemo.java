package com.cg.classwwork;

//explore abstract class,abstract methods,partially implemented class

public class AbstractDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scooty Activa=new Scooty();
		Activa.numberOfWheels();

	}

}


//whenever your requirements are not cleared declare it as abstract
//abstract class is partially implemented
abstract class Vehicle{
	abstract void numberOfWheels();//no body
}

class Scooty extends Vehicle {

	@Override
	void numberOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("two");
		
	}
	
}
