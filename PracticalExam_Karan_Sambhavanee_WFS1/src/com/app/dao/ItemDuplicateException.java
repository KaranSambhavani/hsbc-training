package com.app.dao;

public class ItemDuplicateException extends Exception {

	@Override
	public String toString() {
	
		return "Item Already Exists";
	}
}
