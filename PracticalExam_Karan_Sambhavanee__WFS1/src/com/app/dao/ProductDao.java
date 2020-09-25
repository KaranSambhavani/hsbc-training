package com.app.dao;

import java.util.List;

import com.app.entity.Apparel;
import com.app.entity.Electronics;
import com.app.entity.Food;
import com.app.entity.Product;

/**
 * 
 * @author Karan
 * 
 * Data Access Layer 
 *
 */
public interface ProductDao {

	/**
	 * 
	 * @param p
	 * @throws ItemDuplicateException
	 * @throws CategoryNotExistsException
	 */
	public void addItem(Product p) throws ItemDuplicateException,CategoryNotExistsException;
	
	/**
	 * 
	 * @return List of Food Items
	 */
	public List<Food> retriveFoodItems();
	
	/**
	 * 
	 * @return List of Electronics Items
	 */
	public List<Electronics> retriveEleItems();
	
	/**
	 * 
	 * @return List of Apparel Items
	 */
	public List<Apparel> retriveApparelItems();
	
	
	
}
