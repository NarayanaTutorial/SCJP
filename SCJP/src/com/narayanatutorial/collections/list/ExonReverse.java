package com.narayanatutorial.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ExonReverse {

	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		Collections.reverse(al);
		System.out.println("Rerverse Order:"+al);
	}
}
