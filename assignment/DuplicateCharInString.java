package com.cg.assignment;

public class DuplicateCharInString {
	
	public static void checkDuplicates(String s) {
		char [] ch= s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;	
					ch[j]='0';
					}
				}
			
			if(count>1 && ch[i]!=0) {
				System.out.println("Repeated character's are "
						+" "+ch[i]);
			}
	}
}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		checkDuplicates("Madam");
	}

}
