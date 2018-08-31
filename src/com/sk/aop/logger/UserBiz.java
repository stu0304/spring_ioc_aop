package com.sk.aop.logger;

import org.springframework.stereotype.Component;


public class UserBiz implements IUserBiz{

	private UserDao userDao;
	
	@Override
	public void login() {
		System.out.println("登录业务方法.....");
		userDao.insert();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void findMyData() {
		System.out.println("find。。。。mydata.....");
		
	}
	
	

}
