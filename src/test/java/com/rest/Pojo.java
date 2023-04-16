package com.rest;

public class Pojo {
	
	public Pojo(String fli, String count, String Dest, String URL) {
		this.flightName=fli;
		this.Country=count;
		this.Destinations=Dest;
		this.URL=URL;
		
	}
	
	public String flightName;
	public String Country;
	public String Destinations;
	public String URL;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getDestinations() {
		return Destinations;
	}
	public void setDestination(String destination) {
		Destinations = destination;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}


}
