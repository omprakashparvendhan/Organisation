package com.ash.programming.dao.vo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String addressLn1;
	private String addressLn2;
	private String addressLn3;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	public String getAddressLn1() {
		return addressLn1;
	}
	public void setAddressLn1(String addressLn1) {
		this.addressLn1 = addressLn1;
	}
	public String getAddressLn2() {
		return addressLn2;
	}
	public void setAddressLn2(String addressLn2) {
		this.addressLn2 = addressLn2;
	}
	public String getAddressLn3() {
		return addressLn3;
	}
	public void setAddressLn3(String addressLn3) {
		this.addressLn3 = addressLn3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressLn1=" + addressLn1 + ", addressLn2=" + addressLn2 + ", addressLn3=" + addressLn3
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
}
