package com.demo;

public class User {
	public static void main(String[] args) {
		/*
		Employee emp1 = new Employee();
		emp1.setEmpid(101);
		emp1.setEmpname("Abin");
		emp1.setEmpsal(56000);
		System.out.println("EmpId : "+emp1.getEmpid()+"; Emp Name: "+emp1.getEmpname()+"; Emp Salary: "+emp1.getEmpsal());
		System.out.println(emp1);
		*/
		Employee emp2 = new Employee(102,"Megha",60000);
		System.out.println(emp2);
	}
}
