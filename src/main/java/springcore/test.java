package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore/huz.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp.getId());
		System.out.println(emp.getNmae());
		System.out.println(emp.getNumber());

	}

}
