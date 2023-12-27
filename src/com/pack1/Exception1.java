package com.pack1;

public class Exception1
{
    void meth1()
    {
    System.out.println(10);
    try
    {
    System.out.println("try block executed");
    System.out.println(20/0);
    }
    catch (Exception eobj)
    {
    System.out.println("catch block executed");
    //System.out.println(eobj.getMessage());
    //System.out.println(eobj.toString());
    
    eobj.printStackTrace();
    
    }
    finally
	{
    System.out.println("finaly block executed");	
	}
    System.out.println("SAI");
    }
	
	public static void main(String[] args) 
	{
	new Exception1().meth1();
		

	}
	
}

