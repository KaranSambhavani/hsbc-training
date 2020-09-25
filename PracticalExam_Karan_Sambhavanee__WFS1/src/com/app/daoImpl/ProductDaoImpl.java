package com.app.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.app.dao.CategoryNotExistsException;
import com.app.dao.ItemDuplicateException;
import com.app.dao.ProductDao;
import com.app.entity.Apparel;
import com.app.entity.Electronics;
import com.app.entity.Food;
import com.app.entity.Product;

/**
 * 
 * @author Karan
 * @Purose of this CLass is to add Items in HashMap Collection and Retrive Items From Collection
 * in decending order of Quentity for that there is a ((compareTo)) Method is used in every Entity CLass.
 *
 */
public class ProductDaoImpl implements ProductDao {

	Map<Integer,Food> hm1=new HashMap<>();
	Map<Integer,Apparel> hm2=new HashMap<>();
	Map<Integer,Electronics> hm3=new HashMap<>();
	 Set<Integer> set = new HashSet<Integer>();
	
	/**
	 * 
	 * This addItem Method Add Item based on their Category
	 */
	@Override
	public void addItem(Product p) throws ItemDuplicateException, CategoryNotExistsException{
		
		String s=p.getClass().getSimpleName();
		
		
		if(s.equalsIgnoreCase("Food"))
		{
			Food f=(Food)p;
			
			if(set.contains(f.getItemCode()))
			{
				throw new ItemDuplicateException();
			}
			else
			{
				try
				{
					if(hm1.containsKey(f.getItemCode())) {
						throw new ItemDuplicateException();
					}
					else
					{
						hm1.put(f.getItemCode(),f);	
						set.add(f.getItemCode());
					}
				}
				catch(ItemDuplicateException ex)
				{
					throw new ItemDuplicateException();
				}
				
			}
			
			
		
		}
		else if(s.equalsIgnoreCase("Apparel"))
		{
			
			Apparel a=(Apparel)p;
			if(set.contains(a.getItemCode()))
			{
				throw new ItemDuplicateException();
			}
			else
			{
				try
				{
					if(hm2.containsKey(a.getItemCode())) {
						throw new ItemDuplicateException();
					}
					else
					{
						hm2.put(a.getItemCode(),a);	
						set.add(a.getItemCode());
					}
				}
				catch(ItemDuplicateException ex)
				{
					throw new ItemDuplicateException();
				}
				
			}
		}
		else if(s.equalsIgnoreCase("Electronics"))
		{
			
			Electronics e=(Electronics)p;
			if(set.contains(e.getItemCode()))
			{
				throw new ItemDuplicateException();
			}
			else
			{
				try
				{
					if(hm3.containsKey(e.getItemCode())) {
						throw new ItemDuplicateException();
					}
					else
					{
						hm3.put(e.getItemCode(),e);	
						set.add(e.getItemCode());
					}
				}
				catch(ItemDuplicateException ex)
				{
					throw new ItemDuplicateException();
				}

			}
		}
		else
		{
			
		   throw new CategoryNotExistsException();
			
		}
			
		
		
	}

	

	@Override
	public List<Food> retriveFoodItems() {

		  ArrayList<Food> as=new ArrayList(hm1.values());
		 
		   Collections.sort(as);
		  
		    return as;
	}

	@Override
	public List<Electronics> retriveEleItems() {
		  ArrayList<Electronics> as=new ArrayList(hm3.values());
			 
		   Collections.sort(as);
		  
		   return as;
	}

	@Override
	public List<Apparel> retriveApparelItems() {
		  ArrayList<Apparel> as=new ArrayList(hm2.values());
			 
		   Collections.sort(as);
		  
		   return as;
	}

}
