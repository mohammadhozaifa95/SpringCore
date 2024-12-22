package com.spring.Stereotype.anootation; // Ensure this matches

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
    public static void main(String[] args) {
        ApplicationContext co = new ClassPathXmlApplicationContext("com/spring/Stereotype/anootation/Stereotype.xml");
        Student s1 = co.getBean("ob", Student.class); // Ensure 'ob' matches the @Component annotation
        Student s2 = co.getBean("ob", Student.class);
        
        // Uncomment for debugging
        System.out.println(s1); // Prints the student details
        System.out.println(s1.getaName()); // Prints the list of names
        
        Shop shop1 = co.getBean("shop", Shop.class);
        Shop shop2 = co.getBean("shop", Shop.class);
        System.out.println(shop1);
        System.out.println(shop1.hashCode());
        System.out.println(shop2.hashCode());
    }
}
