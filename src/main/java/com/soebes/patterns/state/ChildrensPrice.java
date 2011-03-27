package com.soebes.patterns.state;

public class ChildrensPrice implements Price {

	public PriceCodeType getPriceCode() {
		return PriceCodeType.CHILDREN_PRICE;
	}

	public double getCharge(int daysRented) {
		double result = 0.0;
		result += 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}

}
