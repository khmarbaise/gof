package com.soebes.patterns.composite;

public class Price {

  public final static Price NOT_APPLICABLE = new Price("Unknown", 0.0f);

  private String currency;
  private Float priceValue;

  public Price(String currency, Float priceValue) {
    super();
    this.currency = currency;
    this.priceValue = priceValue;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Float getPriceValue() {
    return priceValue;
  }

  public void setPriceValue(Float priceValue) {
    this.priceValue = priceValue;
  }

}
