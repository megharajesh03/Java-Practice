package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

//import org.junit.Before;
//import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class MyTest {
	Calc c = new Calc();
	
	/*
	@Before
	public void beforeTest1() {
		System.out.println("Task before test1");
	}

	@Test					//important
	public void test1(){
		assertEquals(25,c.add(13, 12));
		//		assertEquals(22,c.add(13, 12));	//fail

	}
	@After
	public void afterTest1() {			//even if you misplace before and after methods it wont change the output
		System.out.println("Task after test1");
	}

//	@Before
//	public void beforeTest2() {
//		System.out.println("Task before test2");
//	}
//	@Test
//	public void test2() {
//		assertEquals(27,c.cube(3));
//	}
	*/
	
	

	@Test
	public void test1(){
		assertEquals(25,c.add(13, 12));
	}
	@AfterClass
	public static void afterTest1() {
		System.out.println("Task after test1");
	}
	@BeforeClass
	public static void beforeTest1() {
		System.out.println("Task before test1");
	}
	
}
