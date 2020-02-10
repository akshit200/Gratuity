package com.ncr.gratuity.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ncr.gratuity.model.GratuityList;
import HQL.HibernateQuerries;

@Repository
public class GratuityRepository {
	@Autowired
	GratuityCrudRepository gratuityCrudRepository;
	@PersistenceContext
	EntityManager em;
	
	/*public void insert(String Task)
	{
		HibernateQuerries.getData();
	}*/
	public Iterable<GratuityList> getData()
	{
		HibernateQuerries hibernateQuerries=new HibernateQuerries(em);
		return hibernateQuerries.getData(2L);
	}
	/*
	public Iterable<ToDoList> getData() {
		return toDoCrudRepository.findAll();
	}
	*/
	public void deleteAll()
	{
		gratuityCrudRepository.deleteAll();
	}
	
	public void deleteById(long id)
	{
		gratuityCrudRepository.deleteById(id);
	}
}
