package com.sk.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAOP {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // ªÒ»° Spring Context
        IPerson man = (IPerson) context.getBean("personProxy");                        
        man.speak();
	}
}
