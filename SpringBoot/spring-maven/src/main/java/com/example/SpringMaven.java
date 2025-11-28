package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bean.EmployeeBean;
import com.example.service.EmployeeService;

@SpringBootApplication
public class SpringMaven {
	public static void main(String[] args) {
		/*
//		SpringApplication.run(SpringMaven.class, args);
//		System.out.println("Welcome to Spring Maven");
		
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringMaven.class, args);
//		EmployeeBean eb = ctx.getBean(EmployeeBean.class);
		EmployeeBean eb = (EmployeeBean)ctx.getBean("eb");
		eb.setEid(33);
		eb.setEname("Max");
		eb.setEsal(10000);
		System.out.println(eb.getEid()+" "+eb.getEname()+" "+eb.getEsal());
		
		EmployeeBean eb2 = (EmployeeBean)ctx.getBean("eb");
		System.out.println(eb2.getEid()+" "+eb2.getEname()+" "+eb2.getEsal());
		//default scope singleton
		*/
		
		/*
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringMaven.class, args);
		EmployeeBean eb = (EmployeeBean)ctx.getBean("eb");
		EmployeeService eserv=(EmployeeService)ctx.getBean(EmployeeService.class);
		eb.setEid(33);
		eb.setEname("Max");
		eb.setEsal(10000);
		System.out.println(eserv.addEmployee(eb)+" record added successfully..");
		*/
		
		/*
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringMaven.class, args);
		EmployeeBean eb = (EmployeeBean)ctx.getBean("eb");
		EmployeeService eserv=(EmployeeService)ctx.getBean(EmployeeService.class);
		eb.setEid(33);
		eb.setEname("Meg");
		eb.setEsal(10500);
		System.out.println(eserv.updateEmployee(eb)+" record updated successfully..");
		*/
		
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringMaven.class, args);
		EmployeeBean eb = (EmployeeBean)ctx.getBean("eb");
		EmployeeService eserv=(EmployeeService)ctx.getBean(EmployeeService.class);
		eb.setEid(33);
		System.out.println(eserv.deleteEmployee(eb.getEid())+" record deleted successfully..");
		
		
	}

}
