package com.cg.stringandnumbers;

public class CharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hii my name is vikas singh";
		char v='v';
		char i='i';
		
		String substring="kas";
		
		int a = s.indexOf(v);
		System.out.println(a);
		
		int b=s.lastIndexOf(i);
		System.out.println(b);
		
		int a1=s.indexOf(v,4);
		System.out.println(a1);
		
		int b1=s.lastIndexOf(i,7);
		System.out.println(b1);
		
		int c=s.lastIndexOf(substring);
		System.out.println(c);
		
//		boolean b=contains("singh");
//		System.out.println(b);
		
		
		
			

	}

}
