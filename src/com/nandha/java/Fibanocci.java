package com.nandha.java;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 = 1;
		int fib2 = 1;
		int fib3 = 1;
		for(int i=0;i<20; i++) {
			
			fib3 = fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		
			System.out.println(fib3);
			
			

		}
	}

}
