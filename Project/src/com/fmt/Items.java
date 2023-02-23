package com.fmt;

public class Items extends Data {
	
	public Items(String code, String type, String name, String model) {
		super(code);
		this.type = type;
		this.name = name;
		this.model = model;
	}
	
	private String type;
	private String name;
	private String model;
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	
	

}
