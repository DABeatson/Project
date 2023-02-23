package com.fmt;

public class Store {
	
	public Store(String storeCode, String managerCode, String storeStreet, String storeCity, String storeState,
			String storeZip, String storeCountry) {
		this.storeCode = storeCode;
		this.managerCode = managerCode;
		this.storeStreet = storeStreet;
		this.storeCity = storeCity;
		this.storeState = storeState;
		this.storeZip = storeZip;
		this.storeCountry = storeCountry;
	}
	
	private String storeCode;
	private String managerCode;
	private String storeStreet;
	private String storeCity;
	private String storeState;
	private String storeZip;
	private String storeCountry;
	
	public String getStoreCode() {
		return storeCode;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public String getStoreStreet() {
		return storeStreet;
	}
	public String getStoreCity() {
		return storeCity;
	}
	public String getStoreState() {
		return storeState;
	}
	public String getStoreZip() {
		return storeZip;
	}
	public String getStoreCountry() {
		return storeCountry;
	}

}
