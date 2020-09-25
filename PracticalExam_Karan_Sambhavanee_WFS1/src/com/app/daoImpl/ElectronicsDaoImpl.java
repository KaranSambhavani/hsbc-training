package com.app.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.dao.ElectronicsDao;
import com.app.dao.ItemDuplicateException;
import com.app.entity.Electronics;
import com.app.entity.Food;
/**
 * 
 * @author Karan
 * This is dao layer
 *
 */
public class ElectronicsDaoImpl implements ElectronicsDao {

	Map<Integer,Electronics> hm=new HashMap<>();
	@Override
	public void addItem(Electronics e) throws ItemDuplicateException {
		
		try
		{
			if(hm.containsKey(e.getItemCode())) {
				throw new ItemDuplicateException();
			}
			else
			{
				hm.put(e.getItemCode(),e);	
			}
		}
		catch(ItemDuplicateException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

	@Override
	public List<Electronics> retriveElectronicsItems() {
    
		ArrayList<Electronics> as=new ArrayList(hm.values());
		 
		 Collections.sort(as,Collections.reverseOrder());
		   
		   ArrayList<Electronics> as1=new ArrayList<>();
		   
		   for(int i=0;i<3;i++)
		   {
			   as1.add(as.get(i));
		   }
				   
		   
		  return as1;   
	}

}
