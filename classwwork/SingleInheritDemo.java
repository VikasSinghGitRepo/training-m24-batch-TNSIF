package com.cg.classwwork;

public class SingleInheritDemo {

	public static void main(String[] args) {
		B obj=new B();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		
		obj.show();
		obj.display();
		
		C obj1 = new C();
		obj1.Adisplay();
		obj1.Bdisplay();
	}
	
}

class A{
	int a,b;
	
	void display() {
	System.out.println("From class A "+a+" "+b);
	}
}

class B extends A{
	int c;
	void show() {
		System.out.println("From both class A and  B"+a+" "+b+" "+c);
	}
}

interface A1{
	void Adisplay();
}
interface B1{
	void Adisplay();
}

class C implements A1,B1{
	public void Adisplay(){
		System.out.println("I amm from intetface A");
	}
	public void Bdisplay(){
		System.out.println("I amm from intetface B");
		}
	
}
