package com.sk.action;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("filter 销毁......");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		   HttpServletRequest hrequest = (HttpServletRequest)request;
		   hrequest.setCharacterEncoding("UTF-8");
		   
		System.out.println("正在过滤.......");
		HttpSession session = hrequest.getSession();
		
		String userName = (String)session.getAttribute("userName");
		if(userName==null)
		{
			HttpServletResponse hresponse = (HttpServletResponse)response;
			hresponse.sendRedirect("goToLoginPage");
		}
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter 初始化......");
		
	}

}
