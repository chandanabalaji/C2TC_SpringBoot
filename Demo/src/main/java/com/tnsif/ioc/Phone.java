package com.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim s=c.getBean("sim",Sim.class);
		s.calling();
		s.browsing();
		/*
		Jio j =new Jio();
		j.browsing();
		*/
	}

}
