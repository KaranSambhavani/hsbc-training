package com.demo.io.entity;

import java.io.RandomAccessFile;

public class RAfDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf=new RandomAccessFile("F:\\Io\\temp\\lion.txt","r");
		printData(100, raf);
		printData(300, raf);
		
	}
	
	static void printData(int seek,RandomAccessFile rf) throws Exception
	{
		rf.seek(seek);
		int data=0;
		while((data=rf.read())!=-1) {
			System.out.print((char)data);
		}

		System.out.println();
		
	}

}
