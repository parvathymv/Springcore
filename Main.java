package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



//Java Based Configuration
public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new 
				AnnotationConfigApplicationContext(BeanConfig.class);
		//HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		//System.out.println(helloWorld);
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloBean");
		System.out.println(helloWorld.getMessage());
		
		EmployeeService empService = (EmployeeService)ctx.getBean("empService");
		System.out.println(empService.getEmployee());
		
		
		

	}
}
