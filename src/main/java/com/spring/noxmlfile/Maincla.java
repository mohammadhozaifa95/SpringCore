package com.spring.noxmlfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Maincla {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Emp.class);
Clint clint=context.getBean("H",Clint.class);
System.out.println(clint);
clint.studey();
}
}
