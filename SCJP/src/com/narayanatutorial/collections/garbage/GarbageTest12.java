package com.narayanatutorial.collections.garbage;

public class GarbageTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(); // two object is eligible for GC i.e s1 and s2
		}

		public static Student m1() {
			Student s1 = new Student();
			Student s2 = new Student();
			return s1;
		}

}
