package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Course;
import com.example.demo.bean.Student;
import com.example.demo.dao.CourseRepository;
import com.example.demo.dao.StudentRepository;


@Service

public class StudentService {


	@Autowired

	private StudentRepository studentRepository;


	@Autowired

	private CourseRepository courseRepository;


	// Update student's phone number

	public Student updatePhoneNo(Long studentId, String newPhoneNo) {

		Student student = studentRepository.findById(studentId).orElseThrow();

		student.setPhoneNo(newPhoneNo);

		return studentRepository.save(student);

	}


	// Change student's status (Active -> Inactive)

	public Student changeStatus(Long studentId, String newStatus) {

		Student student = studentRepository.findById(studentId).orElseThrow();

		student.setStatus(newStatus);

		return studentRepository.save(student);

	}


	// Increment student's marks by 5 and save updated value

	public Student incrementMarks(Long studentId) {

		Student student = studentRepository.findById(studentId).orElseThrow();

		student.setMarks(student.getMarks() + 5);

		return studentRepository.save(student);

	}


	// Assign a student to a course

	public Student assignCourse(Long studentId, Long courseId) {

		Student student = studentRepository.findById(studentId).orElseThrow();

		Course course = courseRepository.findById(courseId).orElseThrow();

		student.setCourse(course);

		return studentRepository.save(student);

	}


	// Remove a course from a student

	public Student removeCourse(Long studentId) {

		Student student = studentRepository.findById(studentId).orElseThrow();

		student.setCourse(null);

		return studentRepository.save(student);

	}

}