package com.capgemini.Service;

import java.math.BigInteger;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Dao.DaoClass;
import com.capgemini.entity.Test;

@Service
@Transactional
public class ServiceClass {

	@Autowired
	DaoClass dao;
	
   
	public List<Test> testDetails() {
		return dao.findAll();
	}
   public Optional<Test> getTestById(BigInteger id) {
		
		return dao.findById(id);
	}
}