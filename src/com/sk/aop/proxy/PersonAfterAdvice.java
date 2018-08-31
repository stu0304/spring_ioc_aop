package com.sk.aop.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class PersonAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("人类之后.....AI.....");
	}

}
