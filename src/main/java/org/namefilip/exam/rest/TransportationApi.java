package org.namefilip.exam.rest;

import javax.inject.Inject;

import org.namefilip.exam.entity.Transportation;
import org.namefilip.exam.repository.TransportationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/transportation")
public class TransportationApi {
	
	@Inject
	TransportationRepository transportationRepository;
	
	/**
	 * Get a list of transportations
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Transportation> listTransportations() {
		return transportationRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Transportation saveTransportation(@RequestBody Transportation transportationJson) {
		return transportationRepository.save(transportationJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{transportationNumber}", method = RequestMethod.GET)
	public Transportation findTransportation(@PathVariable Integer transportationNumber) {
		return transportationRepository.findOne(transportationNumber);
	}
	
	@RequestMapping(value = "/{transportationNumber}", method = RequestMethod.DELETE)
	public void deleteTransportation(@PathVariable Integer transportationNumber) {
		transportationRepository.delete(transportationNumber);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{transportationNumber}", method = RequestMethod.PUT)
	public Transportation updateTransportation(@RequestBody Transportation transportationJson) {
		return transportationRepository.save(transportationJson);
	}
	
}
