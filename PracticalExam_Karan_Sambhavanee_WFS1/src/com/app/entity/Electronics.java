package com.app.entity;

/**
 * 
 * @author Karan
 *
 */
public class Electronics {

	int itemCode;
	String name;
	double price;
	int warranty;
	int quantity;
	
	
	public Electronics() {
		super();
	}


	public Electronics(int itemCode, String name, double price, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.price = price;
		this.warranty = warranty;
		this.quantity = quantity;
	}


	public int getItemCode() {
		return itemCode;
	}


	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
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


	public int getWarranty() {
		return warranty;
	}


	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
