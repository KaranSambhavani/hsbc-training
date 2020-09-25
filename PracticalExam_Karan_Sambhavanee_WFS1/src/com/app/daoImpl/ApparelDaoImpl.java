package com.app.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.dao.ApparelDao;
import com.app.dao.ItemDuplicateException;
import com.app.entity.Apparel;

/**
 * 
 * @author Karan
 * This is Dao layer
 */
public class ApparelDaoImpl implements ApparelDao {

	Map<Integer,Apparel> hm=new HashMap<>();
	
	@Override
	public void addItem(Apparel a) throws ItemDuplicateException {
		
		try
		{
			if(hm.containsKey(a.getItemCode())) {
				throw new ItemDuplicateException();
			}
			else
			{
				hm.put(a.getItemCode(),a);	
			}
		}
		catch(ItemDuplicateException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		

	}

	@Override
	public List<Apparel> retriveApprealItems() {
		// TODO Auto-generated method stub
		
	   ArrayList<Apparel> as=new ArrayList(hm.values());
	   
	  
	   Collections.sort(as,Collections.reverseOrder());
	   
	   ArrayList<Apparel> as1=new ArrayList<>();
	   
	   for(int i=0;i<3;i++)
	   {
		   as1.add(as.get(i));
	   }
			   
	   
	  return as1;
	}

}
