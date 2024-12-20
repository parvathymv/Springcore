package testproj.beans;

public class Person {
	private String name;
	private Address address;
	public Person()
	{}
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("Person [name=%s, address=%s]", name, address);
	}
	
	

}
