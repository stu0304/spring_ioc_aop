package com.sk.aop.logger;

import org.junit.Test;

public class MyLogger {

	public void myBefore(){
		System.out.println("myBefore 日志");
	}
	
	public void myAfter(){
		System.out.println("myAfter 日志");
	}
	
}
