package com.app.entity;
/**
 * 
 * @author Karan
 * @Purpose Contains Properties of Apparel 
 * Apparel Entity Class
 *
 */
public class Apparel extends Product implements Comparable<Apparel>{
	 int itemCode;
	 String name;
	 int quantity;
	 String size;
	 String Material;
	  
  
	   public Apparel() {
		 super();
	      }
	   
		public Apparel(int itemCode, String name, int quantity, String size, String material) {
			super();
			this.itemCode = itemCode;
			this.name = name;
			this.quantity = quantity;
			this.size = size;
			Material = material;
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
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getMaterial() {
			return Material;
		}
		public void setMaterial(String material) {
			Material = material;
		}

		
		@Override
		public String toString() {
			return "Apparel [itemCode=" + itemCode + ", name=" + name + ", quantity=" + quantity + ", size=" + size
					+ ", Material=" + Material + "]";
		}

		@Override
		public int compareTo(Apparel o) {
			
			return o.quantity-this.quantity;
		}
		  
		
	
}
