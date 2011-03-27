package com.soebes.patterns.state;

public class Rental {

	private Movie movie;
	private int daysRented;


	public Rental(int daysRented, Movie movie) {
		this.daysRented = daysRented;
		this.movie = movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	public int getDaysRented() {
		return daysRented;
	}
	
}
