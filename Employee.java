package com.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("1001")
	private int id;
	@Value("Sai")
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s]", id, name);
	}
	
	
	

}
