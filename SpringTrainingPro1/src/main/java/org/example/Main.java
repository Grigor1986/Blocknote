package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
Staff staff = context.getBean("manager", Manager.class);
staff.doWork();

Staff staff1 = context.getBean("employee", Employee.class);
staff1.doWork();
        System.out.println("end");
    }
}
