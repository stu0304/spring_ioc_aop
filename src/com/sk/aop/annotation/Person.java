package com.sk.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class Person  implements IPerson  {
	@Override
	public void speak() {
		System.out.println("我是 注解人类......");
	}

	@Override
	public void walking(String personName) {
		System.out.println("我是注解 人类. "+personName+"..走路...");
		
	}
	
}
