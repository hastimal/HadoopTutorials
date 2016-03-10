package com.test.pkg;

abstract class A1{
	
	public abstract void m1();
	public void m2(){ 
		System.out.println("M2 is implemented in Abstract Class itself");
	}
}

abstract class B1 extends A1{
	
	public void m1(){
	System.out.println(" M1 implemented ");	
	}
	
	public abstract void m3();
}

class C1 extends B1{
	public void m3(){
		System.out.println("m3 method is implmented");
	}
}
public class AbstractTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 a = new C1();
		a.m1();
		a.m2();
		a.m3();
	}

}
