package Injectproperty.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Injectproperty/ref/mapping.xml");
		A cA = (A) context.getBean("emp2");
		System.out.println(cA.getId());
		System.out.println(cA.getOb().getName());
		System.out.println(cA);


	}
}
