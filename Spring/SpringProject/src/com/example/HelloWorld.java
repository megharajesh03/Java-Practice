package com.example;

public class HelloWorld {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void myinit() {
		System.out.println("Bean initialized");
	}
	public void mydestroy() {
		System.out.println("Bean is destroyed");
	}
}
