package com.nandha.java;

public class Calculator {


		
	private double pi = 3.14;
	
	public long add(int a, int b){
		return a+b;
	}
	
	public long subtraction(int c, int d){
		return c-d;
	}
	public double areaofacircle(int r){
		return pi*r*r;
	
	}
	public double squareroot(int n){
		return Math.sqrt(n);
	}
	public static void main(String args[]){
		Calculator cal=new Calculator();
		System.out.println(cal.squareroot(15));
	}
	 


}
