package org.namefilip.exam.rest;

import javax.inject.Inject;

import org.namefilip.exam.entity.Car;
import org.namefilip.exam.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/car")
public class CarApi {
	
	@Inject
	CarRepository carRepository;
	
	/**
	 * Get a list of cars
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Car> listCars() {
		return carRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Car saveCar(@RequestBody Car carJson) {
		return carRepository.save(carJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{carNumber}", method = RequestMethod.GET)
	public Car findCar(@PathVariable String carNumber) {
		return carRepository.findOne(carNumber);
	}
	
	@RequestMapping(value = "/{carNumber}", method = RequestMethod.DELETE)
	public void deleteCar(@PathVariable String carNumber) {
		carRepository.delete(carNumber);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{carNumber}", method = RequestMethod.PUT)
	public Car updateCar(@RequestBody Car carJson) {
		return carRepository.save(carJson);
	}
	
}
