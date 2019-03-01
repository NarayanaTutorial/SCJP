package com.narayanatutorial.collections.garbage;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		String s = new String("narayana");
		// Test s= new Test();
		s = null;
		System.gc();
		Thread.sleep(10000);
		System.out.println("End of main");
	}

	public void finalize() {
		System.out.println("finalize method called");
	}

}
