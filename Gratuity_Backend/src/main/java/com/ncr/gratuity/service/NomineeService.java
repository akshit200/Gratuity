package com.ncr.gratuity.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ncr.gratuity.model.NomineeList;
import com.ncr.gratuity.repository.NomineeRepository;

public class NomineeService {
	
	
	@Autowired
	NomineeRepository nomineeRepository;
	
	public void putData(NomineeList nomineeList) 
	{
		nomineeRepository.putData();
	}
}
