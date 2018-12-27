package com.onlinebooking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.onlinebooking.app.service.FlightService;

@Controller
public class FlightController {
	
	@Autowired
	FlightService flightServcie;
	
	@GetMapping(value="/show-flights")
	public String showFlights(Model model) {
		
		model.addAttribute("flights", flightServcie.getAll());
		return "flights";
	}
	
	@PostMapping(value="/add-flight")
	public String addFlights() {
		return "addflight";
	}
	
	@PutMapping(value="/edit-flight")
	public String editFlight() {
		return "editflight";
	}
	
	@DeleteMapping(value="/delete-flight")
	public String deleteFlight() {
		return "deleteflight";
	}

}
