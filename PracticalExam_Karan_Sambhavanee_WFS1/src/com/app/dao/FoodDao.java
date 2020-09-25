package com.app.dao;

import java.util.List;

import com.app.entity.Food;

public interface FoodDao {

	public void addItem(Food e) throws ItemDuplicateException;
	public List<Food> retriveFoodItems();
	
}
