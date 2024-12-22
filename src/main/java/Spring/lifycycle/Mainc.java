package Spring.lifycycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainc {
	public static void main(String[] args) {

		// ApplicationContext Context=new
		// ClassPathXmlApplicationContext("Spring/lifycycle/moh.xml");
		AbstractApplicationContext Context = new ClassPathXmlApplicationContext("Spring/lifycycle/moh.xml");
		Geera mainClass = (Geera) Context.getBean("geera");
		Context.registerShutdownHook();
		System.out.println(mainClass);
		Gehu gehu = (Gehu) Context.getBean("ga1");
		System.out.println(gehu);
		Example example = (Example) Context.getBean("ex");
		System.out.println(example);
	}
}
