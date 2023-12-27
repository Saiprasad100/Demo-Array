package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
public class CollectionPgm 
{
	void meth1()
	{
		System.out.println("Implementing ArrayList");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		//al.add("Java");//due to use Generics we will getting an C.E 
		//al.add(null);
		al.add(1);
		al.add(52);
		al.add(99);
		al.add(55);
		al.add(10);
		System.out.println("ArrayList" +al);
		System.out.println("get():"+al.get(4));// 52//Data which is present in 4 index position
		System.out.println("get():"+al.get(al.size()-1));//10//it provides element last element
		System.out.println("size():"+al.size());//8 // it provides Arraylist length 
		System.out.println("------------------");
		System.out.println("Reteriving the data by using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
			
		}
		System.out.println();
		System.out.println("Reteriving the data in Reverse order by using for loop");  
		for(int i=al.size()-1;i>=0;--i)
		{
		System.out.print(al.get(i)+" "); 	
		}
		System.out.println();
		System.out.println("Reteriving the data by using foreach loop");
	    for (int data:al)
		{
		System.out.print(data+" ");	
		}
	    System.out.println();
	    System.out.println("Reteriving the data by using Iterator Interface");
        Iterator<Integer> i=al.iterator();
        while (i.hasNext())//[10 1 52 99 55 10]
       {
	System.out.print(i.next()+" ");//10 1 52 99 55 10
       }
	    System.out.println();
	    System.out.println("-------methods()-----------");
	 System.out.println();
	 System.out.println();
	 al.add(al.size(),100);
	 System.out.println(al);	  
	 al.add(0,500);
	 System.out.println(al);
	 //System.out.println("isEmpty():"+al. isEmpty());
	 //al.clear();
	 System.out.println("contains():"+al.contains(55));
	 System.out.println("contains():"+al.contains(108));
	 System.out.println("----------------remove()------------------");
	 
	 al.remove((Object)100);
	 System.out.println(al);
	System.out.println("====>"+al.remove(2));
	System.out.println(al);
	System.out.println("====>"+al.remove((Object)100));
	System.out.println(al);
	System.out.println("====>"+al.remove((Object)99));
	System.out.println(al);
	 	 }
	
	public static void main(String[] args)
	
	{
	new CollectionPgm().meth1();	
	}
}

	