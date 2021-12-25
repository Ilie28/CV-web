package com.iliealexandru.sweatshirtsstore.product;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="Products")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
	
	public enum Size {
		
		XXS,
		XS,
		S,
		M,
		L,
		XL,
		XXL,
		XXXL
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String name;
	protected double price;
	protected int quantity;
	protected Size size;
	
	public Product() {}
	
	public Product(String name, double price, int quantity, Size size) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String product = "Id: " + id + "Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Product Size: " + size ;
		return product;
	}
}

