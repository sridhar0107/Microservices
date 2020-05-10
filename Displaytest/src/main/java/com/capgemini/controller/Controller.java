package com.capgemini.controller;

import java.math.BigInteger;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.Service.ServiceClass;
import com.capgemini.entity.Test;
import com.capgemini.exceptions.IdNotFoundException;


@RestController
@RequestMapping("/test")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private ServiceClass service;

	@GetMapping("/testdetails")
	public List<Test> TestDetails(){
		List<Test> u=service.testDetails();
		
		return u;
	}
	@GetMapping("/GetTest/{id}")
	public ResponseEntity<Optional<Test>> getTestById(@PathVariable("id") BigInteger id) {
		Optional<Test> e = service.getTestById(id);
		if (e == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<Optional<Test>>(e, new HttpHeaders(), HttpStatus.OK);
		}
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
	