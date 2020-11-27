package com.org;

import java.util.List;
import java.util.stream.Collectors;

public class ProductSelection {

	public static void main(String[] args) {

		List<Laptop> laptops = Laptop.fetchLaptops();
		System.out.println("----- Sequential Stream -----");
		laptops.stream().filter(item -> item.getRatings() > 4.5)
		.collect(Collectors.toList()).stream()
		.sorted((item1, item2) -> Double.compare(item1.getRatings(), item2.getRatings()))
		.forEach(item -> System.out.println(item));
		System.out.println("---- Parallel Stream ----");
		laptops.parallelStream().filter(item -> item.getRatings() > 4.3).forEach(item -> System.out.println(item));
	}

}
