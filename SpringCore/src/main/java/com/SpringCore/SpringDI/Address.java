package com.SpringCore.SpringDI;


public class Address {

	private String City;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + "]";
	}

	
}
