package com.sk.aop.around;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

import com.sk.aop.proxy.IPerson;
import com.sk.aop.proxy.Person;
import com.sk.aop.proxy.PersonBeforeAndAfterAdvice;

public class TestAroundAdvice {

	@Test
	public void test1()
	{
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Person());
		proxyFactory.addAdvice(new PersonAroundAdvice());
		IPerson person = (IPerson)proxyFactory.getProxy();
		person.walking("tom");
	}
}
