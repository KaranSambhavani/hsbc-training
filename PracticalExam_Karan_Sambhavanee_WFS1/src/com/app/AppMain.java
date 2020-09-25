package com.app;


import java.util.Scanner;

import com.app.dao.ApparelDao;
import com.app.dao.ElectronicsDao;
import com.app.dao.FoodDao;
import com.app.daoImpl.ApparelDaoImpl;
import com.app.daoImpl.ElectronicsDaoImpl;
import com.app.daoImpl.FoodDaoImpl;
import com.app.service.ProductService;

/**
 * 
 * @author Karan
 * This is Interaction layer
 */
public class AppMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FoodDao fd=new FoodDaoImpl();
		ApparelDao ad=new ApparelDaoImpl();
		ElectronicsDao ed=new ElectronicsDaoImpl();
		
		ProductService pd=null;
		String s="Food";
		
		if(s.equals("Food"))
		{
			pd=new ProductService(fd);
			pd.foodAddItem(101,"Milk",40,true);
			pd.foodAddItem(102,"curd",40,true);
			pd.foodAddItem(103,"cake",40,true);
			
			pd.showFoodItem();
			
		}
		else if(s.equals("Apparel"))
		{
			pd=new ProductService(ad);
			pd.apparelAddItem(101, "Tshirt", 30,"Large","Cotton");
			pd.apparelAddItem(102, "shirt", 30,"Large","Cotton");
			pd.apparelAddItem(103, "Sweater", 30,"Large","Cotton");
			pd.showApperalItem();
		}
		else if(s.equals("Electronics"))
		{
			pd=new ProductService(ed);
			pd.electronicsAddItem(1013,"Tv",7000,12,30);
			pd.electronicsAddItem(1014,"Mobile",7000,12,30);
			pd.electronicsAddItem(1015,"Watch",7000,12,30);
			
			pd.showElectronicsItem();
			
		}
		
		
		
		
		
	}
}
