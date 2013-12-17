package com.confiz.after.factory;

import com.confiz.after.afactory.Location;

public class SedanCar extends Car {

	public SedanCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}
	
	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
		// add accessories
	}
}