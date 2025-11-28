package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

import com.example.web.bean.StudentBean;
import com.example.web.service.AdminService;

//@RestController 						//necessary for selectAll
@Controller								//necessary for customer
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adserv;
	
	@PostMapping("/user")
	
	//http://localhost:8080/admin/user
	
	//@RequestParam("user")String user,@RequestParam("pass")String pass
	public String meth6(@RequestBody StudentBean sb) {
		if(sb.getName().equals("AD-001")) {		//body => { "name":"AD-001" }
			return "redirect:./userData";		//same file
		}
		if (sb.getName().equals("US-001")) {	//body => { "name":"US-001" }
			return "forward:/customer/data";	//different file
		}
		return "<h1>Welcome</h1>";
	}
	@GetMapping("/userData")
	@ResponseBody
	public String meth7() {
		return "<h1>Welcome to User Login</h1>";
	}
	
	//http://localhost:8080/admin/addStudent
	@PostMapping("/addStudent")
	public String meth1(@RequestBody StudentBean sb) { 		//for reading json object
		return "<h1>"+adserv.addStudent(sb)+" record inserted successfully!</h1>";
	}
	@PutMapping("/updateStudent")
	public String meth2(@RequestBody StudentBean sb) { 		
		return "<h1>"+adserv.updateStudent(sb)+" record updated successfully!</h1>";
	}
	@DeleteMapping("/deleteStudent/{rollno}")
	public String meth3(@PathVariable int rollno) {
		
		return "<h1>"+adserv.deleteStudent(rollno)+" record deleted successfully!</h1>";
	}
	@GetMapping("/selectAll")
	public List<StudentBean> meth4(){
		return adserv.selectAll();
	}

}
