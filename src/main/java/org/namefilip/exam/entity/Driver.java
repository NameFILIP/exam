package org.namefilip.exam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Driver {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	private Double experience;
	private String autobiography;
	private Integer salary;
	
	@ManyToOne
	@JoinColumn(name = "car_number")
	private Car car;
	
    public Integer getId() {
    	return id;
    }
	
    public void setId(Integer id) {
    	this.id = id;
    }
	
    public String getFullName() {
    	return fullName;
    }
	
    public void setFullName(String fullName) {
    	this.fullName = fullName;
    }
	
    public Date getBirthDate() {
    	return birthDate;
    }
	
    public void setBirthDate(Date birthDate) {
    	this.birthDate = birthDate;
    }
	
    public Double getExperience() {
    	return experience;
    }
	
    public void setExperience(Double experience) {
    	this.experience = experience;
    }
	
    public String getAutobiography() {
    	return autobiography;
    }
	
    public void setAutobiography(String autobiography) {
    	this.autobiography = autobiography;
    }
	
    public Integer getSalary() {
    	return salary;
    }
	
    public void setSalary(Integer salary) {
    	this.salary = salary;
    }
	
    public Car getCar() {
    	return car;
    }
	
    public void setCar(Car car) {
    	this.car = car;
    }
    
}
