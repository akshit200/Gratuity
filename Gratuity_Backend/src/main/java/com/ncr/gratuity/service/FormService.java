package com.ncr.gratuity.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ncr.gratuity.ValueObjects.EpsVo;
import com.ncr.gratuity.ValueObjects.FormElevenVo;
import com.ncr.gratuity.ValueObjects.GratuityVo;
import com.ncr.gratuity.model.FormModel;
import com.ncr.gratuity.repository.FormRepository;


@Service
public class FormService {
	
	@Autowired
	FormRepository formRepository;
			/********************
			* 					*
			*      EPS Form		*
			*********************/
	
	
	public EpsVo getEpsData(long id) {
		
		return formRepository.getEpsData(id);
	}

	public String saveEpsData(FormModel formModel)
	{
		return formRepository.saveEpsData(formModel);
	}
	
	/***********************Gratuity Form*************************/
		
    public GratuityVo getGratuityData(long id) {
		
		return formRepository.getGratuityData(id);
	}

    public String saveGratuityData(FormModel formModel) {
    	
	return formRepository.saveGratuityData(formModel);
	
    }

	/*
	public void updateData(String n_name,String n_address,String n_dob,String n_relation,String n_amount,Long id)
	{
		gratuityRepository.updateData(n_name,n_address,n_dob,n_relation,n_amount,id);
	}*/
	/*public void updateNomineeData(NomineeVo nomineeVo)
	{
		gratuityRepository.updateData(nomineeVo);
	}*/

    /***********************Form Eleven*************************/
    
   public FormElevenVo getFormElevenData(long id) {
		
		return formRepository.getFormElevenData(id);
	}

    public String saveFormElevenData(FormModel formModel) {
    	
	return formRepository.saveFormElevenData(formModel);
	
    }

}


