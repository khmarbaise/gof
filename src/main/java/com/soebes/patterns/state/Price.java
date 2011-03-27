package com.soebes.patterns.state;

public interface Price {
	PriceCodeType getPriceCode ();
	double getCharge(int daysRented);
}
