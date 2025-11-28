package com.example.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.bean.FlightBean;
import com.example.web.services.FlightService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private FlightService flightService;
	@GetMapping("/welcome")
	public String meth1() {
		return "<marquee direction='right'>Welcome to Spring Application</marquee>";
	}
	@GetMapping("/data")
	public ArrayList<String> meth2(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("cherry");
		al.add("Strawberry");
		return al;
	}
	@GetMapping("/first")
	public ModelAndView meth3() {
		return new ModelAndView("Login");
	}
//	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	@PostMapping(value ="/validate")
	public ModelAndView meth4(@RequestParam("user")String usr, @RequestParam("pass")String pss) {
		
		if (usr.equals("AD-001")&& pss.equals("AD-001")) {
			return new ModelAndView("AddFlight");
		}
		
		if (usr.equals("AD-002")&& pss.equals("AD-002")) {
			return new ModelAndView("UpdateFlight");
		}
	
		if (usr.equals("AD-003")&& pss.equals("AD-003")) {
			return new ModelAndView("DeleteFlight");
		}
		if (usr.equals("AD-004")&& pss.equals("AD-004")) {
			return new ModelAndView("SelectAll");
		}
		
	
		else {
			return new ModelAndView("Invalid");
		}
	}
	
	/*
	@PostMapping("/addFlight")
	public ModelAndView meth5(@ModelAttribute("fb")FlightBean fb) {
//		return "<h1>"+fb+"</h1>";
		int result = flightService.addFlight(fb);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AddFlight");
		
		if (result>0) {
			modelAndView.addObject("message","Flight added succesfully!");
		}
		else {
			modelAndView.addObject("message","Error. Flight not added.");
		}
		return modelAndView;	
		
	}
	*/
	@PostMapping("/addFlight")
	public String meth5(@ModelAttribute("fb")FlightBean fb) {
		int i = flightService.addFlight(fb);
		
		return "<h1>"+i+" Flight added successfully";	
		
	}
	
	@PostMapping("/deleteFlight")
	public ModelAndView meth6(@RequestParam("flightID") String flightId) {
	    int result = flightService.deleteFlight(flightId);

	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("DeleteFlight");

	    if (result > 0) {
	        modelAndView.addObject("message", "Flight deleted successfully!");
	    } else {
	        modelAndView.addObject("message", "Error. Flight not deleted.");
	    }

	    return modelAndView;
	}

	/*
	@DeleteMapping("/deleteFlight/{flightID}")
	public String meth6(@PathVariable("flightID") String flightID) {
		int i = flightService.deleteFlight(flightID);
		return "<h1>"+i+" Flight added successfully";
	}
	*/
	
	@PostMapping("/updateFlight")
	public ModelAndView meth7(@ModelAttribute("fb")FlightBean fb) {
		
		int result = flightService.updateFlight(fb);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("UpdateFlight");
		
		if (result>0) {
			modelAndView.addObject("message","Flight updated succesfully!");
		}
		else {
			modelAndView.addObject("message","Error. Flight not updated.");
		}
		return modelAndView;		
	}
	@PostMapping("/selectAll")
	public ModelAndView meth8(Model m) {
		ArrayList<FlightBean> allFlights = flightService.selectAllFlights();
		m.addAttribute("aaa",allFlights);
		return new ModelAndView("DisplayFlights");
	}

	
}
