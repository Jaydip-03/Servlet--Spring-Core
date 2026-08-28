package com.jsp.Indigo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flight {
	String flightNumber;
	String destination;
	double ticketPrice;
	boolean isNonStop;
	
	
	
	public String getFlightNumber() {
		return flightNumber;
	}
	@Value(value = "${flight.flightNumber}")
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	
	@Value(value = "${flight.destination}")
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	@Value(value = "${flight.ticketPrice}")
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public boolean isNonStop() {
		return isNonStop;
	}
	
	@Value(value = "${flight.isNonStop}")
	public void setNonStop(boolean isNonStop) {
		this.isNonStop = isNonStop;
	}
	
	
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", destination=" + destination + ", ticketPrice=" + ticketPrice
				+ ", isNonStop=" + isNonStop + "]";
	}
	
	
	
	
	
	
	

}
