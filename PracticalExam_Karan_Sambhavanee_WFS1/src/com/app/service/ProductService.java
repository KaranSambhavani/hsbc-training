package com.app.service;

import com.app.dao.ApparelDao;
import com.app.dao.ElectronicsDao;
import com.app.dao.FoodDao;
import com.app.dao.ItemDuplicateException;
import com.app.entity.Apparel;
import com.app.entity.Electronics;
import com.app.entity.Food;

/**
 * 
 * @author Karan
 * This is service layer
 */
public class ProductService {
  
	ApparelDao ad;
	ElectronicsDao ed;
	FoodDao fd;

	public ProductService(ApparelDao ad) {
		super();
		this.ad = ad;
	}
	
	

	public ProductService(ElectronicsDao ed) {
		super();
		this.ed = ed;
	}
	
	

	public ProductService(FoodDao fd) {
		super();
		this.fd = fd;
	}
	
	public void apparelAddItem(int code,String name,int quantity,String size,String material)
	{
		try {
			ad.addItem(new Apparel(code, name, quantity, size, material));
		} catch (ItemDuplicateException e) {
			
			System.out.println(e);
		}
	}
	
	public void foodAddItem(int itemCode,String itemName,int quantity,Boolean vegetarian)
	{
		try {
			fd.addItem(new Food(itemCode, itemName, quantity, vegetarian));
		} catch (ItemDuplicateException e) {
			
			System.out.println(e);
		}
	}
	
	public void electronicsAddItem(int itemCode,String name,double price,int warranty,int quantity)
	{
		try {
			ed.addItem(new Electronics(itemCode, name, price, warranty, quantity));
		} catch (ItemDuplicateException e) {
			
			System.out.println(e);
		}
	}
	
	public void showApperalItem()
	{
		for(Apparel a:ad.retriveApprealItems())
		{
			System.out.println(a.getItemCode()+" "+a.getName()+" "+a.getQuantity()+" "+a.getSize()+" "+a.getMaterial());
		}
	}
	
	public void showFoodItem()
	{
		for(Food a:fd.retriveFoodItems())
		{
			System.out.println(a.getItemCode()+" "+a.getItemName()+" "+a.getQuantity()+" "+a.isVegetarian());
		}
	}
	public void showElectronicsItem()
	{
		for(Electronics a:ed.retriveElectronicsItems())
		{
			System.out.println(a.getItemCode()+" "+a.getName()+" "+a.getQuantity()+" "+a.getPrice()+" "+a.getQuantity());
		}
	}
	
	
}
