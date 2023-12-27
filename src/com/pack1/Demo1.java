package com.pack1;

public class Demo1 {

	public void calculetor() {
		System.out.println("welcome");
		int a = 10;
		int b = 5;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		System.out.println("Addition result C=:" + c);
		System.out.println("Substraction result d=:" + d);
		System.out.println("Multiplication result e=:" + e);
		System.out.println("Division result f=:" + f);

	}

	public static void main(String[] args) {
		System.out.println("Start");
		Demo1 aobj = new Demo1();
		aobj.calculetor();
	}
}
