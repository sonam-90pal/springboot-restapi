package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.names;
import com.springrestapi.springrestapi.services.NamesServices;

@RestController
public class MyController {
	
    @Autowired
	private NamesServices ns;
	@GetMapping("/home")  //to run this function
	public String home() {      
		//return type is string
		return "Welcome to Banking Application";
	}
	
	//get the employees names
	
	@GetMapping("/names")
	public List<names> getnames(){
	
		//creating another package for services to get all the services for getting names
	return this.ns.getnames();
	}
	
	@GetMapping("/names/{empid}")
	public names getname(@PathVariable String empid)
	{
		return this.ns.getname(Long.parseLong(empid));
	}
	
	@PostMapping("/names")
	public names addname(@RequestBody names name) {
		return this.ns.addname(name);
	}
}
