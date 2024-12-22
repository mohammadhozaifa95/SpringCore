package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Auto {
public static void main(String[] args) {
	
	
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/annotation/moh.xml");
  Employee employee=(Employee)  context.getBean("emp", Employee.class); 
 System.out.println(employee);
}
}
