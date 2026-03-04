package com.fayaz;

import java.util.ArrayList;
import java.util.List;

public class Test_1 {
	public static void main(String[] args) {

		        List<Driver_1> list = new ArrayList<>();

		        list.add(new Driver_1("Auto", 100, "Afzal", 2459));
		        list.add(new Driver_1("Car", 101, "Fouzia", 100.90));
		        list.add(new Driver_1("Car", 102, "Afroz", 2459));
		        list.add(new Driver_1("Lorry", 103, "Rajkumar", 90));
		        list.add(new Driver_1("Auto", 104, "Akhil", 5643));

		        Travel_1 travel = new Travel_1();

		        System.out.println(travel.isCarDriver(list.get(1)));

		        System.out.println(travel.retrivebyDriverId(list, 100));

		        System.out.println("Auto Drivers Count: " +
		                travel.retriveCountOfDriver(list, "Auto"));

		        List<Driver_1> carDrivers = travel.retriveDriver(list, "Car");

		        for (Driver_1 d : carDrivers) {
		            System.out.println("Car Driver: " + d.getDriverName());
		        }

		        Driver_1 max = travel.retriveMaximumDistanceTravelledDriver(list);
		        System.out.println("Maximum Distance Travelled By: " + max.getDriverName());
		    
	}

}
