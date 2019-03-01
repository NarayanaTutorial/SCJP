package com.narayanatutorial.collections.garbage;

public class GarbageTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s3 = m1(); // one object is eligible for GC i.e s2
	}

	public static Student m1() {
		Student s1 = new Student();
		Student s2 = new Student();
		return s1;
	}

}
