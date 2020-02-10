package com.ncr.gratuity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncr.gratuity.model.GratuityList;
import com.ncr.gratuity.repository.GratuityRepository;

@Service
public class GratuityService {
	
	@Autowired
	GratuityRepository gratuityRepository;
	
	public Iterable<GratuityList> getData() {
		
		return gratuityRepository.getData();
	}
	public void delete(long id)
	{
		gratuityRepository.deleteById(id);		
	}
}
