package com.mulesoft.training;

public class Flight {
	
	String code;
	String origin;
	int emptySeats;
	String departureDate;
	String airlineName;
	String destination;
	double price;
	String planeType;
	
	public Flight() {
		super();
	}
	public Flight(String code, String origin, int emptySeats, String departureDate, String airlineName,
			String destination, double price, String planeType) {
		super();
		this.code = code;
		this.origin = origin;
		this.emptySeats = emptySeats;
		this.departureDate = departureDate;
		this.airlineName = airlineName;
		this.destination = destination;
		this.price = price;
		this.planeType = planeType;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getEmptySeats() {
		return emptySeats;
	}
	public void setEmptySeats(int emptySeats) {
		this.emptySeats = emptySeats;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPlaneType() {
		return planeType;
	}
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}	

};
