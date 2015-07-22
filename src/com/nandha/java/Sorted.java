package com.nandha.java;

public class Sorted {

	public static void main(String[] args) {
		int temp = 1;
		int[] array = { 5, 2, 30, 1, 21 };
		for (int i = 0; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
			}
		}System.out.println(temp);

	}

}
