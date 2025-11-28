package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld h1 = ctx.getBean(HelloWorld.class);
		h1.setMsg("Welcome!!!");
		System.out.println(h1);
		System.out.println(h1.getMsg());
		HelloWorld h2 = (HelloWorld)ctx.getBean("hw");
		System.out.println(h2);
		System.out.println(h2.getMsg());
		
	}
}
