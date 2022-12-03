package com.cg.arrays;

public class Array2D {
	
	public static void sumArray() {
		int [] arr= {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		  
        //sum using for loop
		for (int i = 0; i < arr.length; i++)
            sum += arr[i];
  
        System.out.println("sum of array values : " + sum);
        
	}
	
	//method returning array and using array as argument
	public static int [] returnArr(int [] k) {
		int [] a=new int[k.length];
		for(int i=0;i<k.length;i++) {
			a[i]=k[i]+1;
		}
		return a;
	}
	
	
	public static void print2DArray() {
		int arr[][]
	            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
	  
	        // printing 2D array
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++)
	                System.out.print(arr[i][j] + " ");
	  
	            System.out.println();
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
		        //calling sumArray()
		        sumArray();
		        
		        //calling returnArr
		        int [] p= {10,20,30,40,50,60,70};
		        int [] q=new int[p.length];
		        q=returnArr(p);
		        for(int i= 0;i<p.length;i++) {
		        	System.out.println(q[i]);
		        }
		        
		        
		        //calling print2DArray
		        print2DArray();
		        
		        
		        
		  
	}

}
