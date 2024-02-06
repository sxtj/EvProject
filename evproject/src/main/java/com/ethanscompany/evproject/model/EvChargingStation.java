package com.ethanscompany.evproject.model;

public class EvChargingStation {
	
	int id;
	String name;
	Location location;
	String typeOfPlug;
	Level level;
	double pricePerKWH;
	boolean status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getTypeOfPlug() {
		return typeOfPlug;
	}
	public void setTypeOfPlug(String typeOfPlug) {
		this.typeOfPlug = typeOfPlug;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public double getPricePerKWH() {
		return pricePerKWH;
	}
	public void setPricePerKWH(double pricePerKWH) {
		this.pricePerKWH = pricePerKWH;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
