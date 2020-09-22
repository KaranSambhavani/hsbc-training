package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataTiFileWithDOS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos=new FileOutputStream("mydata.dat",true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeInt(100);
		dos.writeUTF("Karan");
		dos.writeUTF("Pune");
		dos.writeDouble(56000.0);
		
		dos.close();
		
	}

}
