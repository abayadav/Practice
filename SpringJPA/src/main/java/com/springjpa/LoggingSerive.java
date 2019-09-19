package com.springjpa;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingSerive {
	
	@Pointcut(value="execution(* com.springjpa.AccountController.get*(..))")
	public void method1(){
		
	}

	
	@Before(value="method1()")
	public void verifyUser(){
		
		System.out.println("LoggingSerive CategoryController ");
	}

}
