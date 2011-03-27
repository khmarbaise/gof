package com.soebes.patterns.state;

public class Movie {

	private String title;
	
	private Price price;

	public Movie() {
		setTitle(null);
		setPrice(null);
	}	

	public Movie(String title, Price price) {
		setTitle(title);
		setPrice(price);
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Price getPrice() {
		return price;
	}

	public PriceCodeType getPriceCode() {
		return price.getPriceCode();
	}

	double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
