package com.test.pkg;

interface I1{
	public void m1();
	public void m2();
	public void m3();
}

class Itest implements I1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 call");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 call");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 call");
	}
	
}

public class InterfaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		I1 i = new Itest();
		i.m1();
		i.m2();
		i.m3();
	}

}
