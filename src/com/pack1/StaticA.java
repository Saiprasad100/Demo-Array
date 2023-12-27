package com.pack1;

public class StaticA 
{
	static int a=0;
	int b=0;
	StaticA()
	{
		a++;
		b++;
		System.out.println("Static variable ===>"+a);
		System.out.println("Instance Variable===>"+b);
		System.out.println("=====================");
		
	}
	void display()
	{
	System.out.println("*****Accending Static Variable*****");
	System.out.println(StaticA.a);
	System.out.println(a);
	System.out.println(new StaticA().a);
	}

	public static void main(String [] args)
	{
	new StaticA();
	new StaticA();
	new StaticA();
	System.out.println("######################");
	new StaticA().display();
	}
}