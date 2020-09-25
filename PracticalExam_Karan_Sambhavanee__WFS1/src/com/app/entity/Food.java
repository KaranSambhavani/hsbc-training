package com.app.entity;

/**
 * 
 * @author Karan
 *
 *@Purpose Contains Properties of Food
 * 
 * Food Entity Class
 */
public class Food extends Product implements Comparable<Food>{

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

    public String getInfo()
    {
    	return itemCode+" "+itemName+" "+quantity+" "+vegetarian;
    }
	
    
	@Override
	public String toString() {
		return "Food [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", vegetarian="
				+ vegetarian + "]";
	}


	@Override
	public int compareTo(Food o) {
		
		return o.quantity-this.quantity;
	}
	
	
}