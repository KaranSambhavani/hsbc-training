package com.prac_2;

/**
 * 
 * @author Karan
 *
 */
public class App {

	public static void main(String[] args) {
		TvRemote ob;
		ob=new BPLTv();
		ob.getInfo();
		
		ob=new PanasonicLTv();
		ob.getInfo();
		
		ob=new SonyTv();
		ob.getInfo();

	}

}
