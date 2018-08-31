package com.sk.aop.annotation;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class LoginAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		beforeLogin();
		arg0.proceed();
		afterLogin();
		return null;
	}

	public void beforeLogin()
	{
		System.out.println("��¼֮ǰ ��¼");
	}
	
	public void afterLogin()
	{
		System.out.println("��¼֮�󡣡����� ��¼");
	}
}
