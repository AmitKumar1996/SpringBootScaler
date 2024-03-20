package com.practice.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	// http://localhost:8080/about
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler...");
		// puting data in table 
		model.addAttribute("name", "Amit kumar");
		
		model.addAttribute("currentDate", new java.util.Date().toLocaleString());
		
		// example 
//		String nameString="abc";
//		nameString.toUpperCase();
		
		return "about";
		// about.html
		
	}
	// handling iteration 
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		// send
		// create a list , set collection 
		
	List<String> names=List.of("Ankit", "Laxmi", "karan", "John");
	  m.addAttribute("names", names);
	  
	
		
		
		return "iterate";
	}
	
	// handler for conditional statements 
	@GetMapping("/Conditional")
	public String conditionHandler(Model m) {
		System.out.println("Conditional handler executed..");
		m.addAttribute("isActive", true);
		
		
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "M");
		
		
		
        List<Integer>	 list=	List.of(233, 43,53,6456,64);
        m.addAttribute("mylist", list);
        
		
		return "Conditional";
	}
	
	// handler for including fragments 
    @GetMapping("/service")
	public String serviceHandler(Model m) {
    	m.addAttribute("title","I like to eat samosa");
    	m.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";
		
	}
    // for new about
    @GetMapping("/newabout")
    public String newAbout() {
    	return "newabout";
    	
    }

}
