package com.fayaz;

public class Driver_1 {
	
	private String categery;
	private int driverId;
	private String driverName;
	private double totalDistance;
	
	
	public Driver_1() {
	
	}
	
	public Driver_1(String categery, int driverId, String driverName, double totalDistance) {
		super();
		this.categery = categery;
		this.driverId = driverId;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}
   
	public String getCategery() {
		return categery;
	}

	public void setCategery(String categery) {
		this.categery = categery;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	
	

}
