package com.sk.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class Person  implements IPerson  {
	@Override
	public void speak() {
		System.out.println("���� ע������......");
	}

	@Override
	public void walking(String personName) {
		System.out.println("����ע�� ����. "+personName+"..��·...");
		
	}
	
}
