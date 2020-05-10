package com.capgemini.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.ServiceClass;
import com.capgemini.entity.Test;


@RestController
@RequestMapping("/test")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private ServiceClass service;
	
	@PostMapping("/addTest")
	public ResponseEntity<String> AddTest(@RequestBody Test test) {
		Test u = service.addTest(test);
		if (u == null) {

			return new ResponseEntity<String>("Test not added", new HttpHeaders(), HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("Test added successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}
}