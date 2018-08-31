package com.sk.aop.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class PersonBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("人类之前.....恐龙");
		
	}

	
}
