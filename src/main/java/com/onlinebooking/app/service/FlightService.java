package com.onlinebooking.app.service;

import java.util.List;

import com.onlinebooking.app.model.Flight;

public interface FlightService {
	
	public List<Flight> getAll();
	
	public Flight findOneByFlightNo(int id);
	
	public Flight deleteFlight(int id);
	
	public Flight save(Flight flight);

}
