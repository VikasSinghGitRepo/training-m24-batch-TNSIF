package com.cg.classwwork;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	Abc l=()->{
			System.out.println(" Lambda Demo ");
		};
		
		l.show();
	}

}

interface Abc{
	void show();
}