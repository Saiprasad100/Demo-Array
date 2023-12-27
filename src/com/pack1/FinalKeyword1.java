package com.pack1;
public class FinalKeyword1 // C.E because final classes cant be Inherited
{
    final int a=10;
   
    final void meth1()
    {
        System.out.println("meth1() called");
        //System.out.println(a++);
        //System.out.println(++a);//C.E because final variables are constants
    }
    public static void main(String[] args)
    {
        new FinalKeyword1().meth1();        
    }
   
}

