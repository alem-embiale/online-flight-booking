package com.onlinebooking.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinebooking.app.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, Integer> {

}
