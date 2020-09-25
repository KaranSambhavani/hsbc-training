package com.app.dao;

import java.util.List;

import com.app.entity.Electronics;

public interface ElectronicsDao {

	public void addItem(Electronics e) throws ItemDuplicateException;
	public List<Electronics> retriveElectronicsItems();
	
}
