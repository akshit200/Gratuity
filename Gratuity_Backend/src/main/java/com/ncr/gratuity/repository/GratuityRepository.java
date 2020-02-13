package com.ncr.gratuity.repository;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

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
		return hibernateQuerries.getData();
	}
	public void updateData(String n_name,String n_address,String n_dob,String n_relation,String n_amount,Long id)
	{
		

		GratuityList g=new GratuityList();
		Optional<GratuityList> g1=gratuityCrudRepository.findById(id);
		g.setN_name(n_name);
		g.setN_address(n_address);
		System.out.println("rohit testing"+n_amount);
		g.setN_amount(n_amount);
//		g.setEps_no(eps_no);
		
		g.setEhusband(g1.get().getEhusband());
		g.setFather_name(g1.get().getFather_name());
		g.setEmp_no(g1.get().getEmp_no());
		g.setGender(g1.get().getGender());
		g.setID(g1.get().getID());
		g.setName(g1.get().getName());
		g.setID(id);
		gratuityCrudRepository.save(g);
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
