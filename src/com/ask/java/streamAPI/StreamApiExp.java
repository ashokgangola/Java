package com.ask.java.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExp {

	public static void main(String[] args) {
		// CALCULATING SQUARES
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
		List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("Squares = " + squares);

		List<String> names = Arrays.asList("Aabmatica", "Traffsys", "Noida", "Delhi");
		// SORTING
		List<String> sorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted = " + sorted);

		// STARTS
		List<String> starts = names.stream().filter(x -> x.startsWith("T")).collect(Collectors.toList());
		System.out.println("starts = " + starts);
		
		numbers.stream().map(x -> x*x).forEach(y -> System.out.println(y));
	}

}
