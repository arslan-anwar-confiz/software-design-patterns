package com.confiz.before;

import com.confiz.after.factory.Car;
import com.confiz.after.factory.CarType;
import com.confiz.after.factory.LuxuryCar;
import com.confiz.after.factory.SedanCar;
import com.confiz.after.factory.SmallCar;


public class BeforeFactory {

	public static void main(String[] args) {
		CarType model = CarType.LUXURY;
		Car car = null;
		
		// we use chunks of if else code through out application (where we need)
		if (model.equals(CarType.LUXURY)){
			car = new LuxuryCar();
		}else if (model.equals(CarType.SEDAN)){
			car = new SmallCar();
		}else if (model.equals(CarType.SMALL)){
			car = new SedanCar();
		}
		
	}
}
