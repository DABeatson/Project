package com.fmt;

public class Equipment extends Item {

	public Equipment(String itemCode, String type, String name, String model) {
		super(itemCode, type, name);
		this.model = model;
	}

	private String model;

	public String getModel() {
		return model;
	}
	
}
