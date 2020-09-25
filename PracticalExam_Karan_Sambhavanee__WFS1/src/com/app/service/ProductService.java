package com.app.service;

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
 *
 * Service Layer
 * 
 * @Purpose of this layer is to call the methods of Data access Layer and we write all Business Logic here.
 */
public class ProductService {

    ProductDao pd;

	public ProductService(ProductDao pd) {
		super();
		this.pd = pd;
	}
    
    public void AddItem(Product p)
    {
    	
    	try {
    		
			pd.addItem(p);
		} catch (ItemDuplicateException e) {
			
			System.out.println(e);
		} catch (CategoryNotExistsException e) {
			System.out.println(e);
		}
    }
    
    public void retriveTopItems(String s) throws CategoryNotExistsException
    {
	      if(s.equalsIgnoreCase("food"))
	      {
	    	  
	    	  int count=0;
	    	  for(Food f:pd.retriveFoodItems())
	    	  {
	    		 System.out.println(f);
	    		 count++;
	    		 if(count==3)
	    		 {
	    			 break;
	    		 }
	    	  }
	    	
	       }
	      else if(s.equalsIgnoreCase("Electronics"))
	      {
	    	  int count=0;
	    	  for(Electronics e:pd.retriveEleItems())
	    	  {
	    		 System.out.println(e);
	    		 count++;
	    		 if(count==3)
	    		 {
	    			 break;
	    		 }
	    	  }
	      }
	      else if(s.equalsIgnoreCase("Apparel"))
	      {
	    	  int count=0;
	    	  for(Apparel a:pd.retriveApparelItems())
	    	  {
	    		 System.out.println(a);
	    		 count++;
	    		 if(count==3)
	    		 {
	    			 break;
	    		 }
	    	  }
	      }
	      else
	      {
	    	  throw new CategoryNotExistsException();
	      }
    }
    
	
	
}
