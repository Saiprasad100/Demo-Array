package com.pack1;
import java.io.FileInputStream;
public class ThrowThrows
{
	int avl_amt = 10000;

	void meth1(int wd_amt)
	{
		if (avl_amt < wd_amt)
		{
			throw new NullPointerException("Insufficient Funds");
		} 
		else
		{
			System.out.println("Transaction Success");
		}
	}
	void meth2() throws Exception 
	{
	System.err.println("-----------Meth2()-------------");
    FileInputStream fis = new FileInputStream("D:\\Core practice\\File1.txt");
	System.out.println("Connection Created");

	}
	public static void main(String[] args)throws Exception
	{  
		ThrowThrows tobj=new ThrowThrows();
        //tobj.meth1(15000);
       tobj.meth2();
}
	
}

		