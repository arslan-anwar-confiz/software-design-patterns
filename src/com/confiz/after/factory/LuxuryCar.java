package com.confiz.after.factory;

import com.confiz.after.afactory.Location;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location){
		super(CarType.LUXURY, location);
		construct();
	}
	
	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
		// add accessories
	}
}
