package com.sk.service;

public class AmericanPerson implements IPersonService {

	private String personName;
	private int personAge;
	@Override
	public void speak() {
		System.out.println("����������");
	}
	
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	

}
