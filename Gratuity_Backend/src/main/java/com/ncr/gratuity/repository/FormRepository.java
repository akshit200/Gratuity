package com.ncr.gratuity.repository;
import java.sql.Date;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncr.gratuity.ValueObjects.EpsVo;

import com.ncr.gratuity.model.FormModel;




@Repository
public class FormRepository {
	@Autowired
	FormCrudRepository formCrudRepository;
	@PersistenceContext
	EntityManager em;
	FormModel formModel = new FormModel(); 

	/*public void insert(String Task)
	{
		HibernateQuerries.getData();
	}*/
	
	
	public EpsVo getEpsData(@RequestParam Long id){
		formModel = formCrudRepository.findById(id).get();
		
		EpsVo epsVo = new EpsVo();
		epsVo.setId(formModel.getForm_id());
		
		epsVo.setFirst_name(formModel.getFirst_name());
		epsVo.setLast_name(formModel.getLast_name());
		epsVo.setPaddress(formModel.getPaddress());
		epsVo.setDob(formModel.getDob().toString());
		epsVo.setMarital_status(formModel.getMarital_status());
		return epsVo;
	}
	
	public EpsVo saveEpsData(@RequestBody EpsVo epsVo){
		formModel = formCrudRepository.findById(epsVo.getId()).get();
		
		formModel.setLast_name(epsVo.getLast_name());
		formModel.setFirst_name(epsVo.getFirst_name());
		formModel.setMarital_status(epsVo.getMarital_status());
		formModel.setEps_no(epsVo.getEps_no());
		formModel.setPaddress(epsVo.getPaddress());
		formModel.setDob(Date.valueOf(epsVo.getDob()));
		formModel.setMarital_status(epsVo.getMarital_status());
		formCrudRepository.save(formModel);
		return epsVo;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void addUser(FormModel formModel) {
		System.out.println("from repository");
		formCrudRepository.save(formModel);
	}
	
	
	/*
	public void updateData()
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
	*/
	
	
	/*
	public Iterable<ToDoList> getData() {
		return toDoCrudRepository.findAll();
	}
	*/
	
}
