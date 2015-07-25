package com.nandha.java;

import java.util.HashMap;
import java.util.Map;

public class Hashmaptest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("D1","Sunday");
		map.put("D2","Monday");
		map.put("D3","Tuesday");
		map.put("D4","Wednesday");
		System.out.println(map.get("D3"));
	}

}
