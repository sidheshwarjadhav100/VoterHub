package com.sid.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int houseNo;
	private String cityname;
	private int pin;

	public Address() {
		super();
	}

	public Address(int houseNo, String cityname, int pin) {
		super();
		this.houseNo = houseNo;
		this.cityname = cityname;
		this.pin = pin;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [cityname=" + cityname + "]";
	}

}
