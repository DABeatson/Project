package com.fmt;

public class Persons extends Data {
	
	public Persons(String code, String lastName, String firstName, String street, String city, String state, String zip,
			String country, String email1, String email2, String email3) {
		super(code);
		this.lastName = lastName;
		this.firstName = firstName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.email1 = email1;
		this.email2 = email2;
		this.email3 = email3;
	}

	private String lastName;
	private String firstName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String email1;
	private String email2;
	private String email3;


	
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
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
	public String getEmail1() {
		return email1;
	}
	public String getEmail2() {
		return email2;
	}
	public String getEmail3() {
		return email3;
	}

}
