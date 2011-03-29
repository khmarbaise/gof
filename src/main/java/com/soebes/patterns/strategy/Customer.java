package com.soebes.patterns.strategy;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();


	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}
	public ArrayList<Rental> getRentals() {
		return rentals;
	}

	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}
}
