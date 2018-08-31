package com.sk.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	@Test
	public void test(){
		
		IPersonService kfc = new AmericanPerson();
		kfc.speak();
		
	}
	
	@Test
	public void testSpring(){
		
		//ChinesePerson kfcChinese = new ChinesePerson();
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonService person = (AmericanPerson)context.getBean("kfcChinese");
		person.speak();
		
		String hello = new String("world");
		String hello2 = "world";
		
		hello=;
		hello+="pear"; // applepear
		
		// ×·¼Ó
		StringBuffer buffer = new StringBuffer("world");
		buffer.append("america");
	}
}
