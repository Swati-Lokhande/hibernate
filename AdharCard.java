package com.hibernate.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {

	@Id
	private int adharNo;
	private String name;
	private String address;
	
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AdharCard() {
		super();
	}
	

	
}
