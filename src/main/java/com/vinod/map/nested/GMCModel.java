package com.vinod.map.nested;

public class GMCModel {

	
	public  GMCModel(){
		
	}
	
	  public java.lang.String getAvailability() {
		return availability;
	}
	public void setAvailability(java.lang.String availability) {
		this.availability = availability;
	}
	public java.util.List<java.lang.String> getAdditionalImageLinks() {
		return additionalImageLinks;
	}
	public void setAdditionalImageLinks(java.util.List<java.lang.String> additionalImageLinks) {
		this.additionalImageLinks = additionalImageLinks;
	}
	public java.lang.Boolean getAdult() {
		return adult;
	}
	public void setAdult(java.lang.Boolean adult) {
		this.adult = adult;
	}
	






	private java.lang.String availability;
	  private java.util.List<java.lang.String> additionalImageLinks;
	  private java.lang.Boolean adult;
	  private String prop2;
	  private String prop3;
	  private GooglePrice price;
	  
	@Override
	public String toString() {
		return "GMCModel [availability=" + availability + ", additionalImageLinks=" + additionalImageLinks + ", adult="
				+ adult + ", prop2=" + prop2 + ", prop3=" + prop3 + ", price=" + price + "]";
	}

	public GooglePrice getPrice() {
		return price;
	}

	public void setPrice(GooglePrice price) {
		this.price = price;
	}

	public String getProp3() {
		return prop3;
	}

	public void setProp3(String prop3) {
		this.prop3 = prop3;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

}
