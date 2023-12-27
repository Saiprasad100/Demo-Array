


package com.pack1;

public class ClassA 
{
    void meth1()
    {
    System.out.println(10);
    try
    {
    System.out.println("try block executed");
    System.out.println(20/0);
    }
    catch(ArithmeticException eobj)
    {
    System.out.println("catch block executed");
    eobj.printStackTrace();
    
    }
    finally
	{
    System.out.println("finaly block executed");	
	}
    System.out.println(30);
    }
	public static void main(String[] args) 
	{
	new ClassA().meth1();
		

	}

}


































	


