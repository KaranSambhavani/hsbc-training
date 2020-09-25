package com.app;


import java.util.Scanner;

import javax.xml.crypto.KeySelector.Purpose;

import com.app.dao.CategoryNotExistsException;
import com.app.dao.ProductDao;
import com.app.daoImpl.ProductDaoImpl;
import com.app.entity.Apparel;
import com.app.entity.Electronics;
import com.app.entity.Food;
import com.app.entity.Product;
import com.app.service.ProductService;

/**
 * View Layer
 * 
 * @author Karan
 * 
 * @purpose of this main is to get the Product Category from clients
 * And Give them to all entry of that category.
 * For that it interacts with service layer and call the method of service layer
 *
 */
public class AppMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product Category....");
		String s=sc.next();
		
		ProductDao pd=new ProductDaoImpl();
		ProductService ps=new ProductService(pd);
		
		if(s.equalsIgnoreCase("food"))
		{
			
			
			Product p1=new Food(101,"Milk",40,true);
			ps.AddItem(p1);
			
			
			Product p2=new Food(111,"Cake",12,true);
			ps.AddItem(p2);
			
			Product p3=new Food(102,"Curd",20,true);
			ps.AddItem(p3);
		
		
			System.out.println("Food details..");
			
			try {
				ps.retriveTopItems(s);
			} catch (CategoryNotExistsException e) {
				System.out.println(e);
			}
		
		}
		else if(s.equalsIgnoreCase("Electronics"))
		{
			Product p1=new Electronics(1026,"Mobile",15000,24,97);
			ps.AddItem(p1);
			
			Product p2=new Electronics(1013,"Tv",45000,12,100);
			ps.AddItem(p2);
			
			Product p3=new Electronics(1026,"Watch",15000,18,54);
			ps.AddItem(p3);
			
			System.out.println("Electronics Details....");
			
			try {
				ps.retriveTopItems(s);
			} catch (CategoryNotExistsException e) {
				System.out.println(e);
			}
			
		}
		else if(s.equalsIgnoreCase("Apparel"))
		{
			Product p1=new Apparel(222,"T-shirt",50,"Large","Cotton");
		    ps.AddItem(p1);
		    
		    Product p2=new Apparel(325,"shirt",20,"Large","Cotton");
		    ps.AddItem(p2);
		    
		    Product p3=new Apparel(432,"Sweater",30,"Medium","Cotton");
		    ps.AddItem(p3);
		    
		    System.out.println("Electronics Details....");
		    
			try {
				ps.retriveTopItems(s);
			} catch (CategoryNotExistsException e) {
				System.out.println(e);
			}
		    
		}
		else
		{
			System.out.println("enter Valid Product Category");
		}
			
		

	}

}
