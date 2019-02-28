package com.narayanatutorial.collections.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapGarbageDemo {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Temp, String> m = new WeakHashMap<Temp, String>();
		Temp t = new Temp();
		m.put(t, "narayana");
		System.out.println("WeakHashMap before garbage called::"+m);
		t = null;
		System.out.println("Garbage Called..");
		System.gc();
		Thread.sleep(5000);
		System.out.println("WeakHashMap after garbage called:"+m);
		
	}
}
