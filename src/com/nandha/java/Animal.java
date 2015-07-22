package com.nandha.java;

public class Animal {
	private String animalType;
	private int animalage;
	
	public static void main(String args[]){
		Animal tiger=new Animal();
		tiger.animalType="Nakul";
		tiger.animalage=56;
		System.out.println(tiger.animalType+" and age is "+ tiger.animalage);
	}

}
