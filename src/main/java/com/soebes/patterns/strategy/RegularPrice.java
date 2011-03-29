package com.soebes.patterns.strategy;

public class RegularPrice implements Price {

	public PriceCodeType getPriceCode() {
		return PriceCodeType.REGULAR_PRICE;
	}

	public double getCharge(int daysRented) {
		double result = 0.0;
		result += 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}

}
