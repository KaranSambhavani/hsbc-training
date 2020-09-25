package com.app.entity;

/**
 * 
 * @author Karan
 *
 */
public class Food {

	int itemCode;
	String itemName;
	int quantity;
	boolean vegetarian;
	
	
	public Food() {
		super();
	}


	public Food(int itemCode, String itemName, int quantity, boolean vegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.vegetarian = vegetarian;
	}


	public int getItemCode() {
		return itemCode;
	}


	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public boolean isVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	
}
