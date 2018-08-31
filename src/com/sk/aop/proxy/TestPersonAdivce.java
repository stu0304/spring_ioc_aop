package com.sk.aop.proxy;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class TestPersonAdivce {

	@Test
	public void test1()
	{
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Person());
		/*proxyFactory.addAdvice(new PersonBeforeAdvice());
		proxyFactory.addAdvice(new PersonAfterAdvice());*/
		proxyFactory.addAdvice(new PersonBeforeAndAfterAdvice());
		IPerson person = (IPerson)proxyFactory.getProxy();
		person.walking();
	}
	
}
