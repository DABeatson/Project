package com.fmt;

public class Item {
	
	public Item (String itemCode, String type, String name) {
		this.itemCode = itemCode;
		this.type = type;
		this.name = name;
	}
	
	private String itemCode;
	private String type;
	private String name;
	
	public String getItemCode() {
		return itemCode;
	}
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}

}
