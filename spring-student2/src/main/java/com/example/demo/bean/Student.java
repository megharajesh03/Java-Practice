package com.example.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Student {


	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String name;

	private int age;

	private String email;

	private String phoneNo; // New field for phone number

	private String status; // New field for status

	private int marks; // New field for marks


	@ManyToOne

	@JoinColumn(name = "course_id")

	private Course course;

	public Student() {

	}



	// Getters and setters for all fields

	public Long getId() {

		return id;

	}


	public void setId(Long id) {

		this.id = id;

	}


	public String getName() {

		return name;

	}


	public void setName(String name) {

		this.name = name;

	}


	public int getAge() {

		return age;

	}


	public void setAge(int age) {

		this.age = age;

	}


	public String getEmail() {

		return email;

	}


	public void setEmail(String email) {

		this.email = email;

	}


	public String getPhoneNo() {

		return phoneNo;

	}


	public void setPhoneNo(String phoneNo) {

		this.phoneNo = phoneNo;

	}


	public String getStatus() {

		return status;

	}


	public void setStatus(String status) {

		this.status = status;

	}


	public int getMarks() {

		return marks;

	}


	public void setMarks(int marks) {

		this.marks = marks;

	}


	public Course getCourse() {

		return course;

	}


	public void setCourse(Course course) {

		this.course = course;

	}

}