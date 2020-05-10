package com.capgemini.service;

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
	
	public Test updateTest(Test test)
	{
		return dao.save(test);
	}
}
