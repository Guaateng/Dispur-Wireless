package com.tcs.group4.bean;

public class Customer {
	private String name;
	private int addressPoscode;
	private String email;
	private int contactNo;
	
	
	
	public Customer() {
		
	}
	
	
	public Customer(String name, int addressPoscode, String email, int contactNo) {
		this.name = name;
		this.addressPoscode = addressPoscode;
		this.email = email;
		this.contactNo = contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAddressPoscode() {
		return addressPoscode;
	}
	public void setAddressPoscode(int addressPoscode) {
		this.addressPoscode = addressPoscode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	

}
