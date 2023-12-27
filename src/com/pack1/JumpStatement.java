package com.pack1;

public class JumpStatement 
{
	void meth1()
	{
		System.out.println("Implementing Jump Statements");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
				//continue;
				//return;
			}
			System.out.println("i value : "+i);
		}
		System.out.println("Compiler came out from for loop");
	}
	public static void main(String[] args)
	{
	System.out.println("Start");
	new JumpStatement().meth1();
	//break;//C.E[Because we can use break statement ONLY inside "switch","loops"]
	//continue;//[Because we can use continue statement inside "loops"]
	System.out.println("End");
	}
}

	
