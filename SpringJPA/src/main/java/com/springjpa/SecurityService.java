package com.springjpa;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class SecurityService {

	
	@Pointcut(value="execution(* com.springjpa.AccountController.save(..))")
	public void method1(){
		
	}

	
	@Before(value="method1()")
	public void verifyUser(JoinPoint jp){
		
		Object [] obj=jp.getArgs();
		
		for (Object object : obj) {
			
			System.out.println(object.toString());
		}
		
		
		
		
	
		
		System.out.println("SecurityService AccountController ");
	}
}
