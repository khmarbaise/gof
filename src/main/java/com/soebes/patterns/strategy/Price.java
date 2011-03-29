package com.soebes.patterns.strategy;

public interface Price {
	PriceCodeType getPriceCode ();
	double getCharge(int daysRented);
}
