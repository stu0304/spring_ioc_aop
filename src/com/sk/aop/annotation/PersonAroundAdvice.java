package com.sk.aop.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
@Component
public class PersonAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		before();

		Object result = methodInvocation.proceed();   // 调用目标方法，获取目标方法返回值
		
		after();
		return "";
	
	}
	
	public void before(){
		System.out.println("around annotation before");
	}
	
	public void after(){
		System.out.println("around annotation after");
	}

}
