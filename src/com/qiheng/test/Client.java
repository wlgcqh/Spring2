package com.qiheng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person chinese = (Person) context.getBean("chinese");
		System.out.println(chinese.sayByebye());
	}
}
