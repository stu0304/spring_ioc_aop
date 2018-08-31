package com.sk.printer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrinter {

	@Test
	public void test1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyPrinter myPrinter = (MyPrinter)context.getBean("helloPrinter");
		myPrinter.print("hello printer.....");
		myPrinter.getMyContent();
		
	}
}
