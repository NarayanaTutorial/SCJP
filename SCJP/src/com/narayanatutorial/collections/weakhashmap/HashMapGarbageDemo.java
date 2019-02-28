package com.narayanatutorial.collections.weakhashmap;

import java.util.HashMap;


public class HashMapGarbageDemo {
	public static void main(String[] args) throws InterruptedException {
		HashMap<Temp, String> m = new HashMap<Temp, String>();
		Temp t = new Temp();
		m.put(t, "narayana");
		System.out.println("HashMap before garbage called::"+m);
		t = null;
		System.out.println("Garbage Called..");
		System.gc();
		Thread.sleep(5000);
		System.out.println("HashMap after garbage called:"+m);
		
	}
}
