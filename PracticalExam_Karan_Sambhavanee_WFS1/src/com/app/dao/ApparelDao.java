package com.app.dao;

import java.util.List;

import com.app.entity.Apparel;

public interface ApparelDao {

	public void addItem(Apparel a) throws ItemDuplicateException;
	public List<Apparel> retriveApprealItems();


}
