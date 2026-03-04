package com.fayaz;

import java.util.List;

public class Travel_1 {
	
	public boolean isCarDriver(Driver_1 driver) {
        return driver.getCategery().equalsIgnoreCase("Car");
    }

    public String retrivebyDriverId(List<Driver_1> list, int driverId) {

        for (Driver_1 driver : list) {
            if (driver.getDriverId() == driverId) {
                return "Driver Name: " + driver.getDriverName() +
                       ", Category: " + driver.getCategery() +
                       ", Distance Travelled: " + driver.getTotalDistance() + " KM";
            }
        }
        return "Driver not found";
    }

    public int retriveCountOfDriver(List<Driver_1> list, String category) {

        int count = 0;

        for (Driver_1 driver : list) {
            if (driver.getCategery().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    public List<Driver_1> retriveDriver(List<Driver_1> list, String category) {

        List<Driver_1> result = new java.util.ArrayList<>();

        for (Driver_1 driver : list) {
            if (driver.getCategery().equalsIgnoreCase(category)) {
                result.add(driver);
            }
        }
        return result;
    }

    public Driver_1 retriveMaximumDistanceTravelledDriver(List<Driver_1> list) {

        Driver_1 maxDriver = list.get(0);

        for (Driver_1 driver : list) {
            if (driver.getTotalDistance() > maxDriver.getTotalDistance()) {
                maxDriver = driver;
            }
        }
        return maxDriver;

}
}
