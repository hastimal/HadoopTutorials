package com.test.pkg;

class MOVehicle
{
	public void makeNoise()
	{
		System.out.println(" Some Noise ");
	}
	public void makeNoise(String s)
	{
		System.out.println("Noise of " + s);
	}
}

class MOSportsCar extends MOVehicle 
{
	public void makeNoise(String s, String y)
	{
		System.out.println("Noise of " + s + " " + y );
	}

}

public class MethodOverloadingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MOSportsCar s = new MOSportsCar();
		MOVehicle v = new MOSportsCar();
		//MOSportsCar m = new Vehicle();
		s.makeNoise();
		s.makeNoise("sports cars");
		s.makeNoise("Blowing", "Sound");
	}

}
