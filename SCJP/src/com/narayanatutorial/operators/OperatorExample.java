package com.narayanatutorial.operators;

public class OperatorExample {


	public static void main(String[] args) {
		int a,b,c,d;
		int total=m1(1) + m1(2) * m1(3) + m1(4) / m1(5) + m1(6);
		System.out.println("Total:"+total);
		
		 a=b=c=d=30;
		 
		 int x = 10;
		 if ( ( ++x < 10) || (x > 10) ) {
		 System.out.println ( "Hello111" ) ;
		 } else {
		 System.out.println ( "Hi111" ) ;
		 }
		 
	
		 if ( ( ++x < 10) && (x > 10) ) {
		 System.out.println ( "Hello" ) ;
		 } else {
		 System.out.println ( "Hi" ) ;
		 } 
		 
		 
		 a+= b+= c/= d%= 20 ;
		 System.out.println( a + "---" + b + "----" + c + " -----" + d );
	}

	public static int m1(int i) {
		System.out.println("value:"+i);
		return i;
	}
}