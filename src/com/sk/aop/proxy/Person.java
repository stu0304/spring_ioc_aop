package com.sk.aop.proxy;

public class Person extends Creature  implements IPerson  {

	
	@Override
	public void speak() {
		System.out.println("��������......");
	}

	@Override
	public void walking(String personName) {
		System.out.println("��������. "+personName+"..��·...");
		
	}

	@Override
	public void living() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
