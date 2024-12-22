package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standalone/huzaifa.xml");
		Student student1 = (Student) context.getBean("student");
		System.out.println(student1);
		System.out.println(student1.getClass());
		System.out.println(student1.getStudentBook().getClass());
	}
}
