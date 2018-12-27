package com.onlinebooking.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebooking.app.model.Flight;
import com.onlinebooking.app.repository.FlightRepository;
import com.onlinebooking.app.service.FlightService;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	Flight flight;
	
	@Override
	public List<Flight> getAll() {
		
		return (List<Flight>) flightRepository.findAll();
	}

	@Override
	public Flight findOneByFlightNo(int id) {
		
		return (Flight) flightRepository.findOne(id);
	}

	@Override
	public Flight deleteFlight(int id) {
		
		 flight = flightRepository.findOne(id);
		 flightRepository.delete(flight);
		 return flight;
	}

	@Override
	public Flight save(Flight flight) {
		
		flightRepository.save(flight);
		return flight;
	}

}
