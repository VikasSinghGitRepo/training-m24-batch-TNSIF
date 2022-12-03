package com.cg.classwwork;

public class Threads {

	public static void main(String[] args) {
		
		
		MyThread obj = new MyThread();
		obj.run();
		// thread 1
		for(int i=0;i<=10;i++) {
			System.out.println("I am main thread "+i);
		}
	}

}


//class MyThread extends Thread{
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			System.out.println("I am my thread "+i);
//		}
//	}
//}

class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("I am my thread "+i);
		}
	}
}
