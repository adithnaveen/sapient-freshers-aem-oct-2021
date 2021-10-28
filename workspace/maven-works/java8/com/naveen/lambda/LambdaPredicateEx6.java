package com.naveen.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicateEx6 {
	public static void main(String[] args) {

		// old style code
		Predicate<Integer> greaterThanZero = new Predicate() {

			@Override
			public boolean test(Object t) {
				Integer ii = (Integer) t;
				if (ii > 0) {
					return true;
				} else {
					return false;
				}
			}
		};

		//////////////////////////////////

		List<Integer> list = Arrays.asList(56, -6, 66, -99, 45, 78, -98, 33, 555, 4);
		Predicate<Integer> greaterThanZero1 = (t) -> t > 0;

		filterNumbers(list, greaterThanZero1).forEach(System.out::println);
	}

	private static List<Integer> filterNumbers(List<Integer> list, 
				Predicate<Integer> greaterThanZero1) {

		List<Integer> positiveNumbers = new ArrayList<>();
		for (Integer temp : list) {
			if (greaterThanZero1.test(temp)) {
				positiveNumbers.add(temp);
			}
		}
		return positiveNumbers;
	}
}
