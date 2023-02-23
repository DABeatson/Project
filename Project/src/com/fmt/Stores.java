package com.fmt;

public class Stores extends Data {
	
	public Stores(String code, String storeCode, String managerCode, String street, String city, String state,
			String zip, String country) {
		super(code);
		this.storeCode = storeCode;
		this.managerCode = managerCode;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	private String storeCode;
	private String managerCode;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public String getStoreCode() {
		return storeCode;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}

}
