package com.fmt;

public class Service extends Item {

	public Service(String itemCode, String type, String name, double hourRate) {
		super(itemCode, type, name);
		this.hourRate = hourRate;
	}

	private double hourRate;

	public double getHourRate() {
		return hourRate;
	}
	
}
