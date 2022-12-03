package com.cg.classwwork;

public class StaticDemo {
	String name; //object bound
	int roll; //object bound
	
	static String coll="Mumbai University"; //class bound
	//whenever we have any variable which have class bound we can declare it static
	
	void display() {
		System.out.println(name+" "+roll+" "+coll);
	}
	
	static void modify() {
		coll="MUMBAI MAHAVIDYALAYA";
	}
	
	
	public StaticDemo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}



	public static void main(String [] args) {
		
		modify();//we are calling static method without creating object
		StaticDemo s1=new StaticDemo("ANITA",1);
		s1.display();
		
		StaticDemo s2=new StaticDemo("Rahul",1);
		s2.display();

		
	}

}
