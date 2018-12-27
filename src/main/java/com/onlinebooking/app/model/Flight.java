package com.onlinebooking.app.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="flight")
public class Flight {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int flightId;
	
	@NotNull(message="block is required")
	@Column(name="flight_number")
	private String flightNumber;
	
	@NotNull(message="block is required")
	@Column(name="airline")
	private String airline;
	
	@NotNull(message="block is required")
	@Column(name="capcity")
	private int capcity;
	
	@Column(name="price")
	private float price;
	
	@Column(name="departure_date_time")
	private LocalDate departureDateTime;
	
	@Column(name="arrival_date_time")
	private LocalDate arrivalDateTime;
	
	@Column(name="departure_airport")
	private String departureAirport;
	
	@Column(name="arrival_airport")
	private String arrivalAirport;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Subscriber subscriber;
	
	public Flight() {
		
	}

	public Flight(String flightNumber, String airline, int capcity,
			float price, LocalDate departureDateTime, LocalDate arrivalDateTime, String departureAirport,
			String arrivalAirport) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.capcity = capcity;
		this.price = price;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getCapcity() {
		return capcity;
	}

	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(LocalDate departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public LocalDate getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDate arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	
	
	

}
