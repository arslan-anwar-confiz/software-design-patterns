package com.confiz.after.factory;

import com.confiz.after.afactory.Location;

public abstract class Car {

	private Location location = null;
	
	public Car(CarType model, Location location){
		this.model = model;
		this.location = location;
		arrangeParts();
	}
	
	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}

	private void arrangeParts() {
		// Do one time processing here
	}

	// Do subclass level processing in this method
	protected abstract void construct();

	private CarType model = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
}