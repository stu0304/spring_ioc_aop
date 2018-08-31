package com.sk.aop.logger;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLogger {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aspect.xml");
		IUserBiz userBiz = (IUserBiz)context.getBean("userBiz");
		userBiz.login();
	}
}
