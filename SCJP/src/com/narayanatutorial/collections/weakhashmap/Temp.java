package com.narayanatutorial.collections.weakhashmap;

public class Temp {
	
	public void finalize() {
		System.out.println(" finalize method");
	}

	public String toString()
    {
     return "temp" ;
    }
}
