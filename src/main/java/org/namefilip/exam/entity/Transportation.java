package org.namefilip.exam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transportation {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String origin;
	
	@Column(name="start_date")
	private Date startDate;
	private String destination;
	
	@Column(name="arrival_date")
	private Date arrivalDate;
	private Integer distance;
	
	@Column(name="total_time")
	private Integer totalTime;
	
	@Column(name="cargo_weight")
	private Integer cargoWeight;
	
	@Column(name="fuel_used")
	private Integer fuelUsed;
	
	@ManyToOne
	@JoinColumn(name = "car_number")
	private Car car;
	
	
    public Integer getId() {
    	return id;
    }
	
    public void setId(Integer id) {
    	this.id = id;
    }
	
    public String getOrigin() {
    	return origin;
    }
	
    public void setOrigin(String origin) {
    	this.origin = origin;
    }
	
    public Date getStartDate() {
    	return startDate;
    }
	
    public void setStartDate(Date startDate) {
    	this.startDate = startDate;
    }
	
    public String getDestination() {
    	return destination;
    }
	
    public void setDestination(String destination) {
    	this.destination = destination;
    }
	
    public Date getArrivalDate() {
    	return arrivalDate;
    }
	
    public void setArrivalDate(Date arrivalDate) {
    	this.arrivalDate = arrivalDate;
    }
	
    public Integer getDistance() {
    	return distance;
    }
	
    public void setDistance(Integer distance) {
    	this.distance = distance;
    }
	
    public Integer getTotalTime() {
    	return totalTime;
    }
	
    public void setTotalTime(Integer totalTime) {
    	this.totalTime = totalTime;
    }
	
    public Integer getCargoWeight() {
    	return cargoWeight;
    }
	
    public void setCargoWeight(Integer cargoWeight) {
    	this.cargoWeight = cargoWeight;
    }
	
    public Integer getFuelUsed() {
    	return fuelUsed;
    }
	
    public void setFuelUsed(Integer fuelUsed) {
    	this.fuelUsed = fuelUsed;
    }
	
    public Car getCar() {
    	return car;
    }
	
    public void setCar(Car car) {
    	this.car = car;
    }
	
}
