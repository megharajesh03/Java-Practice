package com.demo;

public class Employee {
	private int empid;
	private String empname;
	private int empsal;
	public int getEmpid() {
		return empid;
	}
	
	public Employee(int empid, String empname, int empsal) //Constructor
	{
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "EmpId : "+empid+"; Emp Name: "+empname+"; Emp Salary: "+empsal;
	}
}
