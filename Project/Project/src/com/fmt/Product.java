package com.fmt;

public class Product extends Item {
	
	public Product(String itemCode, String type, String name, String size, double cost) {
		super(itemCode, type, name);
		this.size = size;
		this.cost = cost;
	}
	private String size;
	private double cost;
	
	public String getSize() {
		return size;
	}
	public double getCost() {
		return cost;
	}

}
