package com.cg.classwwork;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		int age;
		System.out.println("enter your age: ");
		Scanner sc=new Scanner(System.in);
		
		age=sc.nextInt();
		
		if(age<18) {
			//throw exception class to jvm(handing over the object to jvm)
			throw new CantVote("You cant vote as you are under 18 years of age..");
		}
		else {
			System.out.println("You can cast your vote...");	
		}
		
	}

}

class CantVote extends RuntimeException{
	CantVote(String msg){
		super(msg);
	}
}
