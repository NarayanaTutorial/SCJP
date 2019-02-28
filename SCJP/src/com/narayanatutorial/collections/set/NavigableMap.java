package com.narayanatutorial.collections.set;

import java.util.TreeMap;

public class NavigableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("b", "banana");
		t.put("a", "apple");
		t.put("d", "dog");
		t.put("c", "cat");
		t.put("g", "gun");
		System.out.println("TreeMap:"+t);
		System.out.println("ceilingKey:"+t.ceilingKey("c"));
		System.out.println("higherKey:"+t.higherKey("e"));
		System.out.println("floorKey:"+t.floorKey("e"));
		System.out.println("lowerKey:"+t.lowerKey("e"));
		System.out.println("pollFirstEntry"+t.pollFirstEntry());
		System.out.println("pollFirstEntry:"+t.pollLastEntry());
		System.out.println("pollFirstEntry:"+t.descendingMap());
		System.out.println("final TreeMap"+t);

	}

}
