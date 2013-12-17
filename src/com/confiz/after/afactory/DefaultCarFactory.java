package com.confiz.after.afactory;

import com.confiz.after.factory.Car;
import com.confiz.after.factory.CarType;
import com.confiz.after.factory.LuxuryCar;
import com.confiz.after.factory.SedanCar;
import com.confiz.after.factory.SmallCar;

public class DefaultCarFactory
{
	public static Car buildCar(CarType model)
	{
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;

			case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;

			default:
			//throw some exception
			break;
		}
		return car;
	}
}
