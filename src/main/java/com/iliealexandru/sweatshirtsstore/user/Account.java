package com.iliealexandru.sweatshirtsstore.user;

import java.util.Date;
import java.util.List;


public class Account {
	private String firstName;
	private String lastName;
	private String CNP;
	private String phoneNumber;
	private String email;
	private String deliveryAddress;
	private Date registrationDate;
	
	public Account() {}
	
	public Account(String firstName, String lastName, String CNP, String phoneNumber, String email, String deliveryAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.CNP = CNP;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.deliveryAddress = deliveryAddress;

	}
	public Account(String firstName, String lastName, String CNP, String phoneNumber, String email, String billingAddress, String deliveryAddress, 
			Date registration) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.CNP = CNP;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.deliveryAddress = deliveryAddress;
		this.registrationDate = registrationDate;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCNP() {
		return CNP;
	}
	
	public void setCNP(String CNP) {
		this.CNP = CNP;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	public Date getRegistration() {
		return registrationDate;
	}
	
	public void setRegistration(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		String acc = "First name: " + firstName + ", Last name: " + lastName + "CNP: " + CNP + ", Phone number: " + phoneNumber
				+ ", Email: " + email + ", Delivery address: " + deliveryAddress + ", Registration date: " + registrationDate;
		return acc;
	}
	
	
}
