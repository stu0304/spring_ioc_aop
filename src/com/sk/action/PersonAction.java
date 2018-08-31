package com.sk.action;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.sk.dao.SysUserDao;
import com.sk.model.Employee;
import com.sk.model.TSysUser;

public class PersonAction implements ServletRequestAware,ServletResponseAware{

	private HttpServletRequest request;
	private HttpServletResponse response;
	private SysUserDao userDao;
	
	public String execute()
	{
		System.out.println("struts2 spring .....整合");
		userDao.findMyEmployee();
		return "";
	}
	
	private TSysUser sysUser;
	public String getPersonInfo()
	{
		 TSysUser sysUser = new TSysUser();
		 sysUser=null;
		System.out.println("人员action......");
		Employee ee = new Employee();
		ee.setEid(UUID.randomUUID().toString());
		ee.setDeptid("2");
		ee.setEname("jacky");
		
		userDao.addUser(ee);
		return "goToPerson";
	}
	
	public String login()
	{
		System.out.println("登陆.......");
		/*String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");*/
		
		System.out.println("登录"+sysUser.getUserName()+"------"+sysUser.getUserPwd());
		request.setAttribute("myUserName", sysUser.getUserName());
		request.setAttribute("myPwd", sysUser.getUserPwd());
		
		HttpSession session = request.getSession();
		
	/*	HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("username", "zhangsan");*/
		return "showPerson";
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request=arg0;
	}
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.response=arg0;
	}

	public TSysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(TSysUser sysUser) {
		this.sysUser = sysUser;
	}

	public SysUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(SysUserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
