package com.app.dao;

public class CategoryNotExistsException extends Exception {

	@Override
	public String toString() {
		
		return "Category Doesn't Exists";
	}
	
}
