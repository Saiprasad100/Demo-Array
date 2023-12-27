package com.pack1;

public class Task
{
	/*void display()
	{
		int a=10;
		for(int k=(a++)+(++a)+(++a);k>10;k++)
		{
			System.out.println(k);
			break;
		}
	}
	*/
	void meth2(int b)
	{
	  int a=10;
	  while(a<=20)
	  {
		if(a==15)
		{
			while(b<=30)
			{
			  if(b==25)
			  {
				  break;
			  }
			  System.out.println("b value:"+b);
			  b++;
			 }
			}
		System.out.println("a value:"+a);
		a++;
	  }
	}
	public static void main(String[] args)
	{
		Task aobj = new Task();
		//aobj.display();
		aobj.meth2(20);
	}
}

	
