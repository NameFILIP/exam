package org.namefilip.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Car {
	
	@Id
	private String number;
	private String brand;
	private String status;
	private String location;
	
	@Column(name="average_speed")
	private Integer averageSpeed;
	
	@Column(name="carrying_capacity")
	private Integer carryingCapacity;
	
	@Column(name="fuel_consumption")
	private Double fuelConsumption;
	
	
    public String getNumber() {
    	return number;
    }
	
    public void setNumber(String number) {
    	this.number = number;
    }
	
    public String getBrand() {
    	return brand;
    }
	
    public void setBrand(String brand) {
    	this.brand = brand;
    }
	
    public String getStatus() {
    	return status;
    }
	
    public void setStatus(String status) {
    	this.status = status;
    }
	
    public String getLocation() {
    	return location;
    }
	
    public void setLocation(String location) {
    	this.location = location;
    }
	
    public Integer getAverageSpeed() {
    	return averageSpeed;
    }
	
    public void setAverageSpeed(Integer averageSpeed) {
    	this.averageSpeed = averageSpeed;
    }
	
    public Integer getCarryingCapacity() {
    	return carryingCapacity;
    }
	
    public void setCarryingCapacity(Integer carryingCapacity) {
    	this.carryingCapacity = carryingCapacity;
    }
	
    public Double getFuelConsumption() {
    	return fuelConsumption;
    }
	
    public void setFuelConsumption(Double fuelConsumption) {
    	this.fuelConsumption = fuelConsumption;
    }

}
