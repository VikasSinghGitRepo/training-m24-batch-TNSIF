package com.cg.classwwork;
import org.junit.jupiter.api.*;


import java.util.Scanner;

public class SquareAndString {
	
	
	
	public void square(int s) {
		int res=s*s;
		System.out.println("Square of no "+s+" is "+res);
	}
	
	
	
	public void countA(String s) {
		char [] k=s.toCharArray();
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Hello dear please enter your name");
		String name=sc.next();
		countA(name);
	
		for(int i =0;i<s.length();i++) {
			if(k[i]=='A' || k[i]=='a') {
				count++;
			}
		}
		System.out.println("No of a in this string is "+count);
	}
	


}
