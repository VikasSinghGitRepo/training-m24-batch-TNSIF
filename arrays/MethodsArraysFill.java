package com.cg.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodsArraysFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String a[]
                = new String[] {"A","B","C","D"};
		int i[]=new int[] {90,10,30,20,50,70,40};
 
            // Getting the list view of Array
            List<String> list = Arrays.asList(a);
 
            // Printing all the elements in list object
            System.out.println("The list is: " + list);
            
            
            
            //using Arrays.binarySearch method
            Arrays.sort(i);//array must be sorted before binary search
            
            //binarySearch(arrname,arrayToBeSearched)
            int pos=Arrays.binarySearch(i,30);
            //binarySearch(arrname,startIndex,endIndex,valueToBeSearched)
            int pos1=Arrays.binarySearch(i,0,3,90);
            System.out.println(pos);
            System.out.println(pos1);

            
            
            //using Collections.binarySearch method
            List<Integer> al = new ArrayList<Integer>();//creating empty list
            al.add(12);
            al.add(53);
            al.add(23);
            al.add(46);
            al.add(54);
            int index = Collections.binarySearch(al, 23);
            System.out.println(index);
            
           
            //Comparing to array
            int[] array1 ={6, 7, 8, 11, 18, 8, 2, 5};       
            int[] array2 ={3, 5, 9, 13, 28, 6, 8, 9,10};
            System.out.println("Result is "+ Arrays.compare(array1,array2));//result 1
            //since 6>3 hence array1>array2
            
            
            
            
            Integer[] array11 ={6, 7, 8, 11, 18, 8, 2, 5};       
            Integer[] array12 ={3, 5, 9, 13, 28, 6, 8, 9,10};
            System.out.println("Integer Arrays on comparison: "
                    + Arrays.deepEquals(array11, array12));//false
            //since array every element of array1 != every element of array2
            
            
      
            
            //copy of method in array
            int intArr[] = { 10, 20, 15, 22, 35 };
            
            // To print the elements in one line
            System.out.println("Integer Array: "
                               + Arrays.toString(intArr));
      
            System.out.println("\nNew Arrays by copyOf:\n");
      
            System.out.println("Integer Array: "
                               + Arrays.toString(
                                     Arrays.copyOf(intArr, 10)));
            
            
            
            //hashCode Method
            Integer intArr1[][] = { { 10, 20, 15, 22, 35 } };
            System.out.println("Integer Array: "
                    + Arrays.deepHashCode(intArr1));
            
            
            
            //equals method
            int ar1[] = { 10, 20, 15, 22, 35 };
            int ar2[] = { 10, 15, 22 };
            System.out.println("Integer Arrays on comparison: "
                    + Arrays.equals(ar1, ar2));
            
            
            //fill method
            int intKey = 22;
            Arrays.fill(ar2, intKey);
            System.out.println("Integer Array on filling: "
                    + Arrays.toString(ar2));
            
            
            
            
            
            
           
            
           
            
          
            
            
            
            
            //
            
            
           
            
            
            
            
            

	}

}
