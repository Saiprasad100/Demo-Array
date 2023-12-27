package com.pack1;

public class MultiplicationTable
{
     void meth1(int num)
     {
    	 //MultiplicationTable of number
    	 for(int i=1;i<=10;i++)
    	 {
    		 System.out.println(num+"*"+i+"="+(i*num));
    	 }
     }
     public static void main(String[] args) 
    	 {
    		 new MultiplicationTable().meth1(5);
    	 }
	
}
