package com.iliealexandru.sweatshirtstore.sweatshirt;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.iliealexandru.sweatshirtsstore.product.Product;

@Entity
@Table(name="Sweatshirts")
public class Sweatshirts extends Product {
	
	public enum Gender {
		MALE,
		FEMALE
	}
	
	private String color;
	private Gender gender;
	
	public Sweatshirts() {
		super();
	}
	
	public Sweatshirts(String name, double price, int quantity, Size size, String color, Gender gender) {
		super();
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
