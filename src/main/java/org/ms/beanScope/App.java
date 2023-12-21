package org.ms.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanScopeConf.xml");

        Person p1 = (Person) context.getBean("obj");
        System.out.println("hashcode for person1: "+p1.hashCode());

        Person p2 = (Person) context.getBean("obj");
        System.out.println("hashcode for person2: "+p2.hashCode());

        Teacher t1 = (Teacher) context.getBean("teacher1");
        System.out.println("hashcode for teacher1: "+t1.hashCode());

        Teacher t2 = (Teacher) context.getBean("teacher1");
        System.out.println("hashcode for teacher2: "+t2.hashCode());

        Teacher t3 = (Teacher) context.getBean("teacher2");
        System.out.println("hashcode for teacher3: "+t3.hashCode());

        Teacher t4 = (Teacher) context.getBean("teacher2");
        System.out.println("hashcode for teacher4: " + t4.hashCode());



    }
}
