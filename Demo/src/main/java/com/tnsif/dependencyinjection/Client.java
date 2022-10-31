package com.tnsif.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new ClassPathXmlApplicationContext("beansjob.xml");
		Person pl = c.getBean("pl",Person.class);
		System.out.println(pl);
	}

}
