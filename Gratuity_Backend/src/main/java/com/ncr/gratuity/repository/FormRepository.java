package com.ncr.gratuity.repository;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncr.gratuity.ValueObjects.EpsVo;
import com.ncr.gratuity.ValueObjects.FormElevenVo;
import com.ncr.gratuity.ValueObjects.GratuityVo;
import com.ncr.gratuity.model.FormModel;
import com.ncr.gratuity.model.GratuityNominee;
import com.ncr.gratuity.model.NomineeList;




@Repository
public class FormRepository {
	@Autowired
	FormCrudRepository formCrudRepository;
	@PersistenceContext
	EntityManager em;
	Set<NomineeList> nomineeList=new HashSet<NomineeList>();
	Set<GratuityNominee> gratuityNominee=new HashSet<GratuityNominee>();
		
	
	public EpsVo getEpsData(@RequestParam Long id)
	{
		
		FormModel formModel=new FormModel();
		
		//formModel.getNomineeList().forEach(nominee->{nominee.getFormModel();});
		
		
		formModel= formCrudRepository.findById(id).get();
		EpsVo epsVo=new EpsVo();
		System.out.println("Nominee =="+formModel.getNomineeList());
		for(NomineeList nominee:formModel.getNomineeList()) {
			nomineeList.add(nominee);
		}
		epsVo.setNomineeList(nomineeList);
		//epsVo.setNomineeList(formModel.getNomineeList());
		epsVo.setId(formModel.getForm_id());
		epsVo.setDob(formModel.getDob());
		epsVo.setEps_no(formModel.getEps_no());
		epsVo.setFirst_name(formModel.getFirst_name());
		epsVo.setLast_name(formModel.getLast_name());
		epsVo.setMarital_status(formModel.getMarital_status());
		epsVo.setPaddress(formModel.getPaddress());	
		//formModel
		return epsVo;
		
	}
//	
//	public EpsVo saveEpsData(EpsVo epsVo){
//		FormModel formModel = new FormModel();
//		formModel = formCrudRepository.findById(epsVo.getId()).get();
//		formModel.setLast_name(epsVo.getLast_name());
//		formModel.setFirst_name(epsVo.getFirst_name());
//		formModel.setMarital_status(epsVo.getMarital_status());
//		formModel.setEps_no(epsVo.getEps_no());
//		formModel.setPaddress(epsVo.getPaddress());
//		formModel.setDob(epsVo.getDob());
//		formModel.setMarital_status(epsVo.getMarital_status());
//		formModel.setNomineeList(epsVo.getNomineeList());
//		
//		
//		
//		
//		
//		
//		
//		
//		formCrudRepository.save(formModel);
//		return epsVo;
//	}
	
	
	public String saveEpsData(FormModel formModel) {
		formModel.getNomineeList().forEach(nominee->{nominee.setFormModel(formModel);});
		formCrudRepository.save(formModel);
		return "successful";
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void addUser(FormModel formModel) {
		System.out.println("from repository");
		formCrudRepository.save(formModel);
	}
	
	
	
	
	/***********************************************************************
	 * 			Gratuity Form
	 ***********************************************************************/
	public GratuityVo getGratuityData(@RequestParam Long id)
	{
		
		FormModel formModel=new FormModel();
		
		//formModel.getNomineeList().forEach(nominee->{nominee.getFormModel();});
		
		
		formModel= formCrudRepository.findById(id).get();
		GratuityVo gratuityVo=new GratuityVo();
		System.out.println("Nominee =="+formModel.getNomineeList());
		for(GratuityNominee nominee:formModel.getGratuityNominee()) {
			gratuityNominee.add(nominee);
		}
	
		gratuityVo.setDob(formModel.getDob());
		gratuityVo.setFirst_name(formModel.getFirst_name());
		gratuityVo.setFather_name(formModel.getFather_name());
		gratuityVo.setGender(formModel.getGender());
		gratuityVo.setEmp_no(formModel.getEmp_no());
		gratuityVo.setReligion(formModel.getReligion());
		gratuityVo.setMarital_status(formModel.getMarital_status());
		gratuityVo.setPaddress(formModel.getPaddress());
		gratuityVo.setEhusband(formModel.getEhusband());
				
		return gratuityVo;
		
		
	}
	
	public String saveGratuityData(FormModel formModel) {
		formModel.getNomineeList().forEach(nominee->{nominee.setFormModel(formModel);});
		formCrudRepository.save(formModel);
		return "successful";
	}
	
	/***********************************************************************
	 * 			Form Eleven
	 ***********************************************************************/
	
	public FormElevenVo getFormElevenData(@RequestParam Long id)
	{
		
		FormModel formModel=new FormModel();		
		
		formModel= formCrudRepository.findById(id).get();
		FormElevenVo formElevenVo=new FormElevenVo();
		
		formElevenVo.setEmail_Id(formModel.getEmail_Id());
		formElevenVo.setFather_name(formModel.getFather_name());
		formElevenVo.setFirst_name(formModel.getFirst_name());
		formElevenVo.setGender(formModel.getGender());
		formElevenVo.setIFS_Code(formModel.getIFS_Code());
		formElevenVo.setInternational_worker(formModel.getInternational_worker());
		formElevenVo.setLast_name(formModel.getLast_name());
		formElevenVo.setMarital_status(formModel.getMarital_status());
		formElevenVo.setMobile_no(formModel.getMobile_no());
		formElevenVo.setScheme_1952(formModel.getScheme_1952());
		formElevenVo.setScheme_1955(formModel.getScheme_1955());
		formElevenVo.setAadhar_no(formModel.getAadhar_no());
		formElevenVo.setPAN_no(formModel.getPAN_no());
		
		return formElevenVo;
		
	
	
		
		
	}
	
	
	public String saveFormElevenData(FormModel formModel) {
		formModel.getNomineeList().forEach(nominee->{nominee.setFormModel(formModel);});
		formCrudRepository.save(formModel);
		return "successful";
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