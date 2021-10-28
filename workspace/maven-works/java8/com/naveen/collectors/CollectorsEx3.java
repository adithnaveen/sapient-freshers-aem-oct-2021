package com.naveen.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsEx3 {
	public static void main(String[] args) {
		List<String> list = List.of("sapient", "Sapient", "SAPIENT", "infosys", "INFOSYS");
		
		Map<String, Long> collectList = list.stream()
			.map(name -> name.toUpperCase())
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
		
		System.out.println(collectList);
		
	}
}
