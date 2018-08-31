package com.sk.aop.proxy;

public class Person extends Creature  implements IPerson  {

	
	@Override
	public void speak() {
		System.out.println("我是人类......");
	}

	@Override
	public void walking(String personName) {
		System.out.println("我是人类. "+personName+"..走路...");
		
	}

	@Override
	public void living() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
