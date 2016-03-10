package com.test.pkg;

class Vehicle {
	public int burnFuel(int x) {
		System.out.println("Normal burn rate of" + x);

		return x;
	}
}

class SportsCar extends Vehicle {
	public int burnFuel(int f) {
		System.out.println("Normal burn rate:-" + super.burnFuel(f));
		int n = 3 * f;
		System.out.println("Sportscar burn rate:-" + n);
		return n;
	}
}

public class MethodOverrdingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SportsCar s = new SportsCar();
		s.burnFuel(5);
	}

}
