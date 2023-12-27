package com.pack1;

public class FactorialNumber 
{
	void meth1(int num)
	{
	//Factorial of 5=5*4*3*2*1=120
	int factorial=1;
	for(int i=1;i<=num;i++)
	{
	factorial=factorial*i;	
	}
	System.out.println("Factorial value of "+num+" is = "+factorial);
}
	public static void main(String[] args) 
	{
	new	FactorialNumber().meth1(5);
	}
	
}