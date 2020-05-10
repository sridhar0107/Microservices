package com.capgemini.controller;

import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.ServiceClass;


@RestController
@RequestMapping("/test")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private ServiceClass service;
	
	@DeleteMapping("/deleteTest/{id}")
	public ResponseEntity<String> DeleteTest(@PathVariable("id") BigInteger id) {
		String u = service.deleteTest(id);
		if (u == null) {
			return new ResponseEntity<String>("Delete operation is unsuccessful", new HttpHeaders(), HttpStatus.OK);
			
		
		} else {
			return new ResponseEntity<String>("Delete operation is successful", new HttpHeaders(), HttpStatus.OK);
		}
	}
}