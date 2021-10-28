package com.naveen.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class OrderQuantity {
	private int quantity; 
}

public class CollectorsEx4 {
	public static void main(String[] args) {
		List<OrderQuantity> list = List.of(
				new OrderQuantity(100), 
				new OrderQuantity(67),
				new OrderQuantity(55),
				new OrderQuantity(22),
				new OrderQuantity(45),
				new OrderQuantity(90)
				);
		
		IntSummaryStatistics summaryStatistics = 
				list.stream().mapToInt(x -> x.getQuantity())
				.summaryStatistics(); 
		
		
		
		System.out.println(summaryStatistics);
		System.out.println("Sum of values: " +summaryStatistics.getSum());
		System.out.println("Avg of values: " +summaryStatistics.getAverage());
		System.out.println("Min of values: " +summaryStatistics.getMin());
		System.out.println("Max of values: " +summaryStatistics.getMax());
		System.out.println("Count of values: " +summaryStatistics.getCount());
		
		
	}
}
