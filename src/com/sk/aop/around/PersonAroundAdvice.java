package com.sk.aop.around;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PersonAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		before();

		Object target = methodInvocation.getThis(); // 获取被代理对象
		Method method = methodInvocation.getMethod(); // 获取被代理方法
		Object[] args = methodInvocation.getArguments(); // 获取方法参数
		System.out.println("调用 " + target + " 的 " + method.getName() + " 方法。方法入参：" 
		+ Arrays.toString(args));

		  Object result = methodInvocation.proceed();   // 调用目标方法，获取目标方法返回值
		System.out.println("调用 " + target + " 的 " + method.getName() + " 方法。 "
		+ "方法返回值：" + "");
		
		after();
		return "";
	
	}
	
	public void before(){
		System.out.println("around before");
	}
	
	public void after(){
		System.out.println("around after");
	}

}
