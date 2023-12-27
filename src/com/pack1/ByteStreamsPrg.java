package com.pack1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ByteStreamsPrg 
{
 	void fileOperations1()throws Exception
 	{
 		System.out.println("Reading the data from a file");
 		FileInputStream fis = new FileInputStream("D:\\NIT\\File1.txt");
 		System.out.println("Connection Created");
 		int i;
 		while((i=fis.read())!=-1)
        {
	System.out.print((char)i);
        }
 		System.out.println();
 		System.out.println("Data Reterived");
 		fis.close();
 	  }
 	
 void fileOperations2()throws Exception
 {
	 System.out.println("Writing data into a file");
	 FileOutputStream fos = new FileOutputStream("D:\\NIT\\File2.txt",true);
	 System.out.println("Connection Created");
	 String data=",So I love it";
	 byte arr[]=data.getBytes();
	 fos.write(arr);
	 System.out.println("Data Written"); 
	 fos.close();
	 
 }
 void fileOperations3()throws Exception
 {
 System.out.println("Copying the data from one file into another File");
 FileInputStream fis = new FileInputStream("D:\\NIT\\pic1.jpg");
 FileOutputStream fos = new FileOutputStream("D:\\NIT\\pic2.jpg");
 System.out.println("Connection Created");
 int i;
 while((i=fis.read())!=-1)
 {
	 fos.write(i);
 }
 System.out.println("Data Copied");
 fis.close();
 fos.close();
}

 	public static void main(String[] args) throws Exception
 	{
 		ByteStreamsPrg aobj = new ByteStreamsPrg();
 		//aobj.fileOperations1();
 		//aobj.fileOperations2();
 		aobj.fileOperations3();
	}
}
  

	
	