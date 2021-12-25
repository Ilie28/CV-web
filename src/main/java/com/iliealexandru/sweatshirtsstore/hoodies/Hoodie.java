package com.iliealexandru.sweatshirtsstore.hoodies;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.iliealexandru.sweatshirtsstore.product.Product;
import com.iliealexandru.sweatshirtsstore.product.Product.Size;
import com.iliealexandru.sweatshirtstore.sweatshirt.Sweatshirts.Gender;

@Entity
@Table(name="Hoodie")
public class Hoodie extends Product {
	
	public enum Gender {
		MALE,
		FEMALE
	}
	
	public Hoodie() {
		super();
	}
	
	private String color;
	private Gender gender;
	
	public Hoodie(String name, double price, int quantity, Size size) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
		this.gender = gender;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Color: " + color + ", Gender: " + gender;
	}
}