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
		log.info("���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
			+ " ������������Σ�" + Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(pointcut = "execution(* com.sk.aop.logger.IUserBiz.*(..))", returning = "returnValue")
	public void afterReturning(JoinPoint jp, Object  returnValue) {
		log.info("���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
			+ " ��������������ֵ��" + returnValue);
	}


	
}
