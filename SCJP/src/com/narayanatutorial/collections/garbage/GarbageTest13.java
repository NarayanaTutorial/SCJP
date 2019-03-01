package com.narayanatutorial.collections.garbage;

public class GarbageTest13 {


	
	public static void main(String[] args) {
		Student s;
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1=s2;
		s2=s3;
		s3=s1;
		//No object eligible for Garbage Collection
		
		s1=null;
		s2=null;
		s3=null;
		//3 Objects eligible for Garbage Collection

	}

}
