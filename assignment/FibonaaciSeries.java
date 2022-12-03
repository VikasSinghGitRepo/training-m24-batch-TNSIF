package com.cg.assignment;
import java.util.Scanner;

public class FibonaaciSeries {
	
	public static void fibonacciSeries() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of characters you want to print for");
		int n=sc.nextInt();
		int n1=0;int n2=1;
		System.out.println(n1+"  "+n2+" ");
		for(int i=0;i<n;i++) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciSeries();
		

	}

}
