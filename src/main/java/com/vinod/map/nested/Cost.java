package com.vinod.map.nested;

public class Cost {

	public String currency;
	public float value;
	public String getCurrency() {
		System.out.println("Get Currency Getting Called");
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Cost [currency=" + currency + ", value=" + value + "]";
	}
	
}
