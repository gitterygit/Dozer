package com.vinod.map.nested;

public class GooglePrice {

	public GooglePrice(){
		
	}
	public String country;
	public float value;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "GooglePrice [country=" + country + ", value=" + value + "]";
	}
	
}
