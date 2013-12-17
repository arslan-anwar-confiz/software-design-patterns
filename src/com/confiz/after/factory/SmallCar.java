package com.confiz.after.factory;

import com.confiz.after.afactory.Location;

public class SmallCar extends Car {

	public SmallCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}
	
	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
		// add accessories
	}
}
