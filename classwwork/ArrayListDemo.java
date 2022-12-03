package com.cg.classwwork;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		
		
		ArrayList l = new ArrayList();
		l.add("Vikas");
		l.add(21);
		l.add(70.5);
		l.add("A+");
		l.add(null);
		
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(0,"mr");
		System.out.println(l);
		
		
		//i want to store only string values
//		ArrayList l = new ArrayList();
//		l.add("Alia");
//		l.add("Ranveer");
//		l.add(70);
		

		

	}

}
