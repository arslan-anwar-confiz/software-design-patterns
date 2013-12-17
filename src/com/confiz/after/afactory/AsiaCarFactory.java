package com.confiz.after.afactory;

import com.confiz.after.factory.Car;
import com.confiz.after.factory.CarType;
import com.confiz.after.factory.LuxuryCar;
import com.confiz.after.factory.SedanCar;
import com.confiz.after.factory.SmallCar;

public class AsiaCarFactory
{
	public static Car buildCar(CarType model)
	{
		Car car = null;
		switch (model)
		{
			case SMALL:
			car = new SmallCar(Location.ASIA);
			break;

			case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;

			case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;

			default:
			//throw some exception
			break;
		}
		return car;
	}
}

