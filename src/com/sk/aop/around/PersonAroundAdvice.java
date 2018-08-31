package com.sk.aop.around;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PersonAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		before();

		Object target = methodInvocation.getThis(); // ��ȡ���������
		Method method = methodInvocation.getMethod(); // ��ȡ��������
		Object[] args = methodInvocation.getArguments(); // ��ȡ��������
		System.out.println("���� " + target + " �� " + method.getName() + " ������������Σ�" 
		+ Arrays.toString(args));

		  Object result = methodInvocation.proceed();   // ����Ŀ�귽������ȡĿ�귽������ֵ
		System.out.println("���� " + target + " �� " + method.getName() + " ������ "
		+ "��������ֵ��" + "");
		
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
