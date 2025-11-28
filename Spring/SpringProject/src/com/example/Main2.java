package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main2 {

	public static void main(String[] args) {
		BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("beans2.xml"));
//		Calc c = (Calc) ctx.getBean("c1");
//		c.add();
		
		Cat c1=(Cat)ctx.getBean("con");
		System.out.println(c1.getLegs());
		
		Cat c2=(Cat)ctx.getBean("con1");
		System.out.println(c2.getName());
		
		Cat c3=(Cat)ctx.getBean("con2");
		System.out.println(c3.getLegs()+" and "+c3.getName());
		
	}
	
	
}
