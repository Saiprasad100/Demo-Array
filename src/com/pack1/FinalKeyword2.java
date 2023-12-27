package com.pack1;

public class FinalKeyword2 extends FinalKeyword1
{
    void meth10() // C.E because final methods cant be Overidden
    {
        System.out.println("ClassB method");
    }
    public static void main(String[] args)
    {
        FinalKeyword1 aobj=new  FinalKeyword2();
        aobj.meth1();
    }
}

