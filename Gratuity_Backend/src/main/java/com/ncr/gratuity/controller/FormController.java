package com.ncr.gratuity.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;
import com.ncr.gratuity.ValueObjects.EpsVo;
import com.ncr.gratuity.ValueObjects.GratuityVo;
import com.ncr.gratuity.ValueObjects.NomineeVo;
import com.ncr.gratuity.model.FormModel;

import com.ncr.gratuity.service.FormService;


import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
@CrossOrigin(origins = "http://localhost:4200")
public class FormController {

	@Autowired
	FormService formService;
	
				/*--------------------/
			 	* --------------------/
			 	* ------EPS FORM------/
			 	* --------------------/
			 	* --------------------*/
	

	@ApiOperation(value="",notes="")
	@GetMapping(value="/api/get_eps_data")
	public EpsVo getEpsData(@RequestParam Long id)
	{
		return formService.getEpsData(id);
		
	}
	
//	@PostMapping(value="/api/save_eps_data")
//	public EpsVo saveEpsData(@RequestBody EpsVo epsVo)
//	{
//		return formService.saveEpsData(epsVo);
//		
//	}
//	
	@PostMapping(value="/api/save_eps_data")
	public String saveEpsData(@RequestBody FormModel formModel)
	{
		return formService.saveEpsData(formModel);
		
	}
	
	/**************************Gratuity Form***********************************/
	
	
	@GetMapping(value="/api/get_gratuity_data")
	public GratuityVo getGratuityData(@RequestParam Long id)
	{
		return formService.getGratuityData(id);
		
	}
	
	@PostMapping(value="/api/save_gratuity_data")
	public String saveGratuityData(@RequestBody FormModel formModel)
	{
		return formService.saveGratuityData(formModel);
		
	}

}
