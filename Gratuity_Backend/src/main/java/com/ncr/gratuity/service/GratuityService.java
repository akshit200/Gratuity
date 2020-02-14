package com.ncr.gratuity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncr.gratuity.model.GratuityList;
import com.ncr.gratuity.repository.GratuityRepository;

@Service
public class GratuityService {
	
	@Autowired
	GratuityRepository gratuityRepository;
	
	public Iterable<GratuityList> getData() {
		
		return gratuityRepository.getData();
	}
	public Optional<GratuityList> findById(long id)
	{
		return gratuityRepository.findById(id);
	}
	public void updateData(String n_name,String n_address,String n_dob,String n_relation,String n_amount,Long id)
	{
		gratuityRepository.updateData(n_name,n_address,n_dob,n_relation,n_amount,id);
	}
	public void delete(long id)
	{
		gratuityRepository.deleteById(id);		
	}
}
