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
	}/*
	public GratuityList getDataById(long id)
	{
		return gratuityRepository.findById(id);
	}*/
	public void updateData(String padress,String religion,Long id)
	{
		gratuityRepository.updateData(padress,religion,id);
	}
	public void delete(long id)
	{
		gratuityRepository.deleteById(id);		
	}
}
