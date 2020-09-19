package com.dem.io;

import java.io.File;

public class FileDemo {
 public static void main(String[] args) {
	
	 File file=new File("F:\\Io\\temp");
	 
	 System.out.println("Directory: "+file.isDirectory());
	 System.out.println("Is Writable: "+file.canWrite());
}
}
