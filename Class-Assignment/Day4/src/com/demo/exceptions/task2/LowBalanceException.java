package com.demo.exceptions.task2;

public class LowBalanceException extends Exception {

	@Override
	public String toString() {
		return "Balance is less than min amount";
	}
	
	
}
