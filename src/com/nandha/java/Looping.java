package com.nandha.java;

public class Looping {

	public static void main(String[] args) {
		int total =0;
		
		for (int i=0; i<=10; i=i+1) {
			System.out.println(i);
			total = total + i;
		}
		System.out.println("Total is " + total);
		
		int j = 0;
		total = 0;
		while (j<=-1) {
			System.out.println("inside while loop" +j);
			total = total + j;
			j=j+1;
		}
		System.out.println("Total while loop is " + total);
		
		int k=0;
		total = 0 ;
		do {
			System.out.println("Total do while loop is " +k);
			total = total + k;
			k=k+1;
		} while (k<=-1);
		System.out.println("Total do while is " + total);
		
	}

}
