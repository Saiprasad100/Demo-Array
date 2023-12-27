package com.pack1;
import java.util.Scanner;
public class ClassStringHandling
{
    void meth1 ()
    {
       System.out.println("Impliment String Class Methods");
       String s1="Saiprasad";
       String s2= new String("Saiprasad");
       String s3="Saiprasad";
       String s4=new String("Saiprasad");
       
       System.out.println (s1.equals(s2));//true
       System.out.println (s1.equals(s3));//true
       System.out.println (s1.equals(s4));//true
       System.out.println (s2.equals(s3));//true
       System.out.println (s2.equals(s4));//true
       System.out.println ("Saiprasad".equals(s2));//true
       System.out.println ("SAIPRASAD".equals("Saiprasad"));//false
       System.out.println ("====>"+"SAIPRASAD".equalsIgnoreCase(s1));//true
       
       System.out.println("***********************");
       
       System.out.println(s1==s2);//false
       System.out.println(s1==s3);//true
       System.out.println(s1==s4);//false
       System.out.println(s2==s3);//false
       System.out.println(s2==s4);//false
       System.out.println("Saiprasad"==s1);//true
       System.out.println("Saiprasad"=="Saiprasad");//true
       System.out.println("Saiprasad"==new String("Saiprasad"));//false
       System.out.println("s1"==new String("Saiprasad"));//false
       
       System.out.println("=================================");
       
       
       System.out.println("length():"+s1.length());//9
       System.out.println("concat():"+s1.concat(" is a good boy"));
       System.out.println("length():"+s1.concat(" is a good boy").length());//23
      
       System.out.println("s1:"+s1);//Saiprasad
       
       System.out.println("<===========================>");
       
       System.out.println("charAt():"+s1.charAt(7));//s
       System.out.println("charAt():"+s1.charAt(s1.length()-5));//r
     
      System.out.println("========================");
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter Your Course C/J ");
       String data=sc.next();
       
       sc.close();
       char course =data.charAt(0);
       
       switch(course)
       {
       case 'C':
    	   System.out.println("Your course is C programming");
    	   break;
       case 'J':
    	   System.out.println("Your Course is Java");
    	   break;
    	   
       default:
    	   System.out.println("Invalid Input");
    	   break;
       }
       
       System.out.println("startWith():"+s1.startsWith("T"));//false
       System.out.println("startWith():"+s1.startsWith("S"));//true
       System.out.println("startWith():"+s1.startsWith("s"));//false
       System.out.println("startWith():"+"Saiprasad is a good boy".startsWith(s1));//true  
       System.out.println("startsWith():"+"Saiprasad is a good boy".startsWith(" ".concat(s1)));//false
       
       System.out.println("================================");
       System.out.println("toLowerCase():"+s1.toLowerCase());//saiprasad
       System.out.println("s1 : " + s1);//Saiprasad
       System.out.println("toUpperCase():"+s1.toUpperCase());//SAIPRASAD
       
       String s5="Health is Wealth";
       System.out.println("substring(int a) : "+s5.substring(10));//Wealth
       System.out.println("substring(int a, int b) : "+s5.substring(7,9));//is
       System.out.println("replace() : "+s1.replace('a', 'A'));//SAiprAsAd
       System.out.println("s1 : "+s1);//Saiprasad
       String s6=" Jay Gagannath ";
       System.out.println(s6.length());//15
       System.out.println("trim() : "+s6.trim().length());//13
       System.out.println("indexOf() : "+s1.indexOf('a'));//1
       System.out.println("lastIndexOf() : "+s1.lastIndexOf('a'));//7 
       
    }
       
       
      
	public static void main(String[] args)
	{
		ClassStringHandling aobj=new ClassStringHandling();
		aobj.meth1();

	}

}
