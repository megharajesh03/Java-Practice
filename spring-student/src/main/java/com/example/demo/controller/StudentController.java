package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;


@RestController

@RequestMapping("/students")

public class StudentController {


	@Autowired

	private StudentService studentService;


	// Update student's phone number

	@PutMapping("/{id}/phone")

	public Student updatePhoneNo(@PathVariable Long id, @RequestParam String phoneNo) {

		return studentService.updatePhoneNo(id, phoneNo);

	}


	// Change student's status (Active -> Inactive)

	@PutMapping("/{id}/status")

	public Student changeStatus(@PathVariable Long id, @RequestParam String status) {

		return studentService.changeStatus(id, status);

	}


	// Increment student's marks by 5 and save updated value

	@PutMapping("/{id}/marks")

	public Student incrementMarks(@PathVariable Long id) {

		return studentService.incrementMarks(id);

	}


	// Assign student to course (many-to-one relationship)

	@PutMapping("/{studentId}/course/{courseId}")

	public Student assignCourse(@PathVariable Long studentId, @PathVariable Long courseId) {

		return studentService.assignCourse(studentId, courseId);

	}


	// Remove course from student

	@PutMapping("/{id}/removeCourse")

	public Student removeCourse(@PathVariable Long id) {

		return studentService.removeCourse(id);

	}

}
