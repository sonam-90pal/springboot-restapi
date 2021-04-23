package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.names;
import com.springrestapi.springrestapi.services.NamesServices;

@RestController
public class MyController {
	
    @Autowired
	private NamesServices ns;
	
	//get the employees names
	
	@GetMapping("/names")
	public List<names> getnames(){
	
		//creating another package for services to get all the services for getting names
	return this.ns.getnames();
	}
	
	//getting name for particular employee id
	@GetMapping("/names/{empid}")
	public names getname(@PathVariable String empid)
	{
		return this.ns.getname(Long.parseLong(empid));
	}
	
	//adding names
	@PostMapping("/names")
	public names addname(@RequestBody names name) {
		return this.ns.addname(name);
	}
	
	//update name using post request
	@PutMapping("/names")
	public names updatename(@RequestBody names name) {
		return this.ns.updatename(name);
	}
	
	//delete name
	@DeleteMapping("/names/{empid}")
	public ResponseEntity<HttpStatus> deletename(@PathVariable String empid){
		try {
			this.ns.deletename(Long.parseLong(empid));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
