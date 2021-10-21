package com.naveen.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		
		
		map.put("rishab", 100); 
		map.put("arjun", 200); 
		map.put("ronak", 300); 
		
		System.out.println(map.get("arjun"));
		
		map.put("arjun", 500); 
		

		Iterator<Entry<String, Integer>> iterator =map.entrySet().iterator(); 
		
		while(iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next(); 
			System.out.println(next.getKey() +", " + next.getValue());
		}
	}
}
