package com.capgemini.Service;

import java.math.BigInteger;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Dao.DaoClass;

@Service
@Transactional
public class ServiceClass {

	@Autowired
	DaoClass dao;
	
	
	public String deleteTest(BigInteger id)
	{
		if(dao.existsById(id))
		{
		  dao.deleteById(id);
		  return "deleted successfully";
		}
		else
		{
			return null;
		}
	}


	
}

