package com.pack1;

public class StarSquare 
{
     void meth1()
	 {
		for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5;j++)
			 {
			  System.out.print("* ");
					 
			 }
			    System.out.println();
				 
	     }
	 }
     
     void meth2()
     {
      for(int i=1;i<=5;i++)
      {
    	  for (int j=1;j<=i;j++)
    	  {
    		  System.out.print("* ");
		  }
    	  System.out.println();
    	  
    	 
	   }
     }
    
     void meth3()
     {
      for(int i=1;i<=5;i++)
      {
    	  for (int j=i;j<=5;j++)
    	  {
    		  System.out.print("* ");
		  }
    	  System.out.println();
	   }
     }
     
     void display(int n)
     {
    	int i,j;
    	for (i=0;i<n;i++)
    	{
    		for (j=2*(n-i);j>=0;j--)
    		{
    			System.out.print(" ");
    		}
    		for(j=0;j<=i;j++)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
	 public static void main(String[] args)
	 {
	 //new  StarSquare().meth1();
	// new  StarSquare().meth2();
	 //System.out.println("-----------------");
	 //new  StarSquare().meth3();
	// System.out.println("''''''''''''''''''''''''''''");
	 StarSquare obj=new StarSquare();
	 obj.display(5);
	 }
	 

}

	