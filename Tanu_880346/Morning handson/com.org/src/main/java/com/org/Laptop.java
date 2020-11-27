package com.org;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

	private String brandName;
	private double ratings;
	private double price;
	private int ramSize;
	public Laptop(String brandName, double ratings, double price, int ramSize) {
		super();
		this.brandName = brandName;
		this.ratings = ratings;
		this.price = price;
		this.ramSize = ramSize;
	}
	public Laptop() {
		super();
	}
	public static List<Laptop> fetchLaptops() {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("HP", 4.2, 60000, 16));
		laptops.add(new Laptop("Acer", 4.1, 55000, 16));
		laptops.add(new Laptop("Dell", 4.3, 65000, 16));
		laptops.add(new Laptop("Lenova", 4.0, 50000, 8));
		laptops.add(new Laptop("HP", 4.5, 65000, 16));
		laptops.add(new Laptop("Acer", 4.3, 60000, 16));
		laptops.add(new Laptop("Dell", 3.9, 30000, 4));
		laptops.add(new Laptop("Lenova", 3.5, 25000, 4));
		laptops.add(new Laptop("HP", 4.8, 80000, 32));
		laptops.add(new Laptop("Acer", 4.6, 63000,32));
		laptops.add(new Laptop("Dell", 4.4, 50000, 8));
		laptops.add(new Laptop("Lenova", 4.3, 75000, 16));
		return laptops;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", ratings=" + ratings + ", price=" + price + ", ramSize=" + ramSize
				+ "]";
	}
}
