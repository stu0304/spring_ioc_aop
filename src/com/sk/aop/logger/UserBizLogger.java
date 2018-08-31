package com.sk.aop.logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserBizLogger {
	
	private static final Logger log = Logger.getLogger(UserBizLogger.class);
	
	@Before("execution(* com.sk.aop.logger.IUserBiz.*(..))")
	public void before(JoinPoint  jp) {
		log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() 
			+ " 方法。方法入参：" + Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(pointcut = "execution(* com.sk.aop.logger.IUserBiz.*(..))", returning = "returnValue")
	public void afterReturning(JoinPoint jp, Object  returnValue) {
		log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() 
			+ " 方法。方法返回值：" + returnValue);
	}


	
}
