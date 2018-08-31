package com.sk.action;

public class MyAction {

	// struts 默认的方法
	public String execute(){
		System.out.println("struts2 跳转.....");
		return "myfirstStruts2";
	}
	
	public String hello(){
		return "";
	}
}
