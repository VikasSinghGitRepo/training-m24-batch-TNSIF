package com.cg.arrays;


class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
    Student(String name){
    	this.name=name;
    }
    public String toString(){
        return name;
    }
}


public class ArrayDeclareAndInitialize {
	
	public static void arrayOne() {
		// declares an Array of integers.
        int[] arr;
  
        // allocating memory for 5 integers.
        arr = new int[5];
  
        // initialize the first elements of the array
        arr[0] = 10;
  
        // initialize the second elements of the array
        arr[1] = 20;
  
        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
  
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                               + " : " + arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	arrayOne();
		
		
		//Array of objects
		Student[] arr;
		arr = new Student[5];
		
		arr[0] = new Student(1, "aman");
		arr[1] = new Student(2, "vaibhav");
    	arr[2] = new Student(3, "shikar");
	    arr[3] = new Student(4, "dharmesh");
	    arr[4] = new Student(5, "mohit");
	    
	    for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                               + arr[i].roll_no + " "
                               + arr[i].name);
	    
	    
	    
	    //another way
	    Student [] mystudent=new Student[] {new Student(1,"aman1"),
	    		
	    		new Student(2,"vaibhav1"),new Student(3,"shikar1"),
	    		new Student(4,"dharmesh1"),new Student(5,"mohit1")};
	    
 	    
	   
	    
	    System.out.println("using another way of initialization and for each loop");
	    for(Student m:mystudent){    
            System.out.println(m);
        }
	    
//	    for (int i = 0; i < mystudent.length; i++)
//            System.out.println("Element at " + i + " : "
//                               + mystudent[i].roll_no + " "
//                               + mystudent[i].name);
	    
	    
	    
	  
	}

}
