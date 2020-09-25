package com.app.dao;

public class ItemDuplicateException extends Exception {

	@Override
	public String toString() {
		
		return "This Item is Already Exists";
	}
}
