package com.example;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld h = (HelloWorld)ctx.getBean("hw");
		h.setMsg("Welcome to Spring");
		System.out.println(h);			// try for prototype scope
		
		System.out.println(h.getMsg());
		
		HelloWorld h2 = (HelloWorld)ctx.getBean(HelloWorld.class);
		System.out.println(h2);
//		h2.setMsg("Welcome to UST!");
		System.out.println(h2.getMsg());
		
		ctx.registerShutdownHook();
		
		/*
		Calc c = (Calc)ctx.getBean(Calc.class);
		c.add();
		
		Calc c1= new Calc();	//object made directly
		c1.setX(20);
		c1.setY(22);
		c1.add();
		*/
	}
	
}
