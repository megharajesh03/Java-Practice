package com.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component(value="eb")
@Scope(value="prototype")
public class EmployeeBean {
	private int eid;
	private String ename;
	private int esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
}
