package com.sk.service;

public class ChinesePerson implements IPersonService {

	private String personName;
	private int personAge;
	@Override
	public void speak() {
		System.out.println("我是中国人");
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
