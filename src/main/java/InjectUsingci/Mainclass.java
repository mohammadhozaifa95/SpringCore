package InjectUsingci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("InjectUsingci/Huz.xml");
	           persion persion1=(persion)context.getBean("Persion");
	           System.out.println(persion1);
	       Addition addition  =(Addition)  context.getBean("add");
	       addition.sum();
}
}
