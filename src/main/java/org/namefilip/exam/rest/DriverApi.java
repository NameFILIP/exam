package org.namefilip.exam.rest;

import javax.inject.Inject;

import org.namefilip.exam.entity.Driver;
import org.namefilip.exam.repository.DriverRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/driver")
public class DriverApi {
	
	@Inject
	DriverRepository driverRepository;
	
	/**
	 * Get a list of drivers
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Driver> listDrivers() {
		return driverRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Driver saveDriver(@RequestBody Driver driverJson) {
		return driverRepository.save(driverJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{driverNumber}", method = RequestMethod.GET)
	public Driver findDriver(@PathVariable Integer driverNumber) {
		return driverRepository.findOne(driverNumber);
	}
	
	@RequestMapping(value = "/{driverNumber}", method = RequestMethod.DELETE)
	public void deleteDriver(@PathVariable Integer driverNumber) {
		driverRepository.delete(driverNumber);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{driverNumber}", method = RequestMethod.PUT)
	public Driver updateDriver(@RequestBody Driver driverJson) {
		return driverRepository.save(driverJson);
	}
	
}
