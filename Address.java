package testproj.beans;

public class Address {
	private String city;
	private String zipcode;
	public Address(){}
	public Address(String city, String zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return String.format("Address [city=%s, zipcode=%s]", city, zipcode);
	}
	

}
