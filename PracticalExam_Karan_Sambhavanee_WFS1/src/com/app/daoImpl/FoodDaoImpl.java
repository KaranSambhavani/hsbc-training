package com.app.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.dao.FoodDao;
import com.app.dao.ItemDuplicateException;
import com.app.entity.Apparel;
import com.app.entity.Food;

/**
 * 
 * @author Karan
 * This is Dao layer
 *
 */
public class FoodDaoImpl implements FoodDao {

	Map<Integer,Food> hm=new HashMap<>();
	
	@Override
	public void addItem(Food f) throws ItemDuplicateException {
		
		try
		{
			if(hm.containsKey(f.getItemCode())) {
				throw new ItemDuplicateException();
			}
			else
			{
				hm.put(f.getItemCode(),f);	
			}
		}
		catch(ItemDuplicateException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public List<Food> retriveFoodItems() {
		
		 ArrayList<Food> as=new ArrayList(hm.values());
		 
		 Collections.sort(as,Collections.reverseOrder());
		   
		   ArrayList<Food> as1=new ArrayList<>();
		   
		   for(int i=0;i<3;i++)
		   {
			   as1.add(as.get(i));
		   }
				   
		   
		  return as1;
		
	}

}
