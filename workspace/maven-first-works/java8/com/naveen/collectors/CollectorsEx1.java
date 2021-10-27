package com.naveen.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Office{
	private String name; 
	private String country; 
	
}
public class CollectorsEx1 {
	public static void main(String[] args) {
		List<Office> list = List.of(
				new Office("Sapient", "India"), 
				new Office("Sapient", "France"),
				new Office("Sapient", "US"),
				new Office("Infosys", "India"),
				new Office("Infosys", "France"),
				new Office("UNext", "India"));
		
		
		Map<String, Long> collect = list.stream().collect
					(Collectors.groupingBy(Office::getName, Collectors.counting()));
		
		System.out.println(collect);


		Map<String, Long> collect1 = list.stream().collect
					(Collectors.groupingBy(Office::getCountry, Collectors.counting()));
		
		System.out.println(collect1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
