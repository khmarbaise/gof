package com.soebes.patterns.strategy;

public class BlockBusterPrice implements Price {

	public PriceCodeType getPriceCode() {
		return PriceCodeType.BLOCK_BUSTER_PRICE;
	}

	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

}
