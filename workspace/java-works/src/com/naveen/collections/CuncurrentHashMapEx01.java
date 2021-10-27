package com.naveen.collections;

import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHashMapEx01 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(); 
	
		System.out.println(map);
		map.put("ashutosh", 1234); 
		map.put("ronak", 3232); 
		
		System.out.println(map);
		
		map.put("ronak", 4433);
		map.put("ronak", 4433);
		System.out.println(map);
		 
		map.putIfAbsent("ronak", 4411);
		System.out.println(map);
		map.remove("ronak");
		
		System.out.println(map);
		map.putIfAbsent("ronak", 4411);
		System.out.println(map);
		
	}
}
