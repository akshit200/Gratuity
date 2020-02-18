package com.ncr.gratuity.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class NomineeRepository {
	@Autowired
	//NomineeCrudRepository nomineeCrudRepository;
	@PersistenceContext
	EntityManager em;
	
	public void putData()
	{
	

	}
	

}
